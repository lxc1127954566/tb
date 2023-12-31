package com.tb.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Druid连接池配置
 * @author lincx
 * @date 2023/11/04
 * */
@Configuration
public class DruidConfig {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druidDataSource(){
        return new DruidDataSource();
    }

    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean<StatViewServlet> bean =
                new ServletRegistrationBean<StatViewServlet>(new StatViewServlet(), "/druid/*");

        //后台需要有人登录，进行配置，可以添加映射
        //bean.addUrlMappings();
        //设置一些初始化参数
        Map<String, String> initParas = new HashMap<String, String>();
        initParas.put("loginUsername", "admin");
        initParas.put("loginPassword", "123456");
        //允许谁能防伪
        //这个值为空或没有就允许所有人访问，ip白名单
        initParas.put("allow","");
        //只允许本机访问，多个ip逗号隔开
        //initParas.put("allow","localhost");
        //ip黑名单，拒绝谁访问deny和allow同时存在，优先级deny
        //initParas.put("deny","");
        //禁止HTML页面的Reset按钮
        initParas.put("resetEnable","false");
        bean.setInitParameters(initParas);;
        return bean;
    }

    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        //可以设置、获取
        bean.setFilter(new WebStatFilter());
        bean.addUrlPatterns("/*");
        //可以过滤和排除一些内容
        Map<String, String> initParams = new HashMap<String, String>();
        //把不需要监控的过滤掉，这些不进行统计
        initParams.put("exclusions", "*.js,*.css,/druid/*");
        bean.setInitParameters(initParams);
        return bean;
    }

}
