package com.tb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(value = {
        "com.tb.manager.impl",
        "com.tb.interfaceManager.xbb.impl",
        "com.tb.common.component",
        "com.tb.config",
        "com.tb.scheduler",
        "com.tb.service.impl",
        "com.tb.interfaceManager.yida.impl",
        "com.tb.controller"
})
public class E10Main {

    public static void main(String[] args) {
        SpringApplication.run(E10Main.class, args);
    }
}
