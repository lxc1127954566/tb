package com.tb.aop;

import com.tb.common.api.CommonResult;
import com.tb.common.exception.TBConcreteException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class ExceptionHandle {

    /**
     * 判断错误是否是已定义的已知错误，不是则由未知错误代替，同时记录在log中
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public CommonResult exceptionGet(Throwable e){
        if(e instanceof TBConcreteException){
            TBConcreteException exception = (TBConcreteException)e;
            return CommonResult.failed(exception);
        }
        if(e instanceof Exception){
            Exception exception = (Exception)e;
            return CommonResult.failed(exception.getMessage());
        }

        return CommonResult.failed("unknown error");
    }

}
