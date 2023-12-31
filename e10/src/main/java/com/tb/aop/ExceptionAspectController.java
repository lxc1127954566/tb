package com.tb.aop;

import com.tb.common.exception.TBConcreteException;
import com.tb.domain.e10.po.ExceptionHandleRecords;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Component
@Aspect
@Slf4j
public class ExceptionAspectController {

    /**
     * 全局异常处理类
     * */
    @Autowired
    private ExceptionHandle exceptionHandle;

    private ExceptionHandleRecords records;

    @Pointcut("execution(* com.tb.controller.*.*(..))")//此处基于自身项目的路径做具体的设置
    public void pointCut(){}

    @Around("pointCut()")
    public Object handleControllerMethod(ProceedingJoinPoint point) throws Throwable {
        Object result = null;
        long beginTime = System.currentTimeMillis();
        HttpServletRequest request = null;
        try {
            // 执行方法
            request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            result = point.proceed();
            MethodSignature methodSignature =(MethodSignature) point.getSignature();
            String[] parameterNames = methodSignature.getParameterNames();
            Object[] param =point.getArgs();
            StringBuffer str=new StringBuffer();
            if(parameterNames!=null){
                for(int i=0;i<parameterNames.length;i++){
                    if (null !=param[i]){
                        str.append(param[i].toString());
                    }
                }
            }
            records = new ExceptionHandleRecords();
            records.setUrl(request.getRequestURL().toString());
            records.setMethod(request.getMethod());
            records.setParams(str.toString());
            records.setTime(System.currentTimeMillis());
            records.setResult(result.toString());
            log.info("[接口监控服务]  : "+records.toString());
        } catch (TBConcreteException tbex) {
            log.error("请求: "+request.getRequestURI()+" 异常",tbex);
            return exceptionHandle.exceptionGet(tbex);
        } catch (Exception ex){
            log.error("请求: "+request.getRequestURI()+" 异常",ex);
            return exceptionHandle.exceptionGet(ex);
        }
        // 执行时长(毫秒)
        long time = System.currentTimeMillis() - beginTime;
        log.info("use time :"+time);
        return result;
    }
}
