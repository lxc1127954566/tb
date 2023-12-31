package com.tb.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.tb.mbg.mapper")
public class MybatisConfig {
}
