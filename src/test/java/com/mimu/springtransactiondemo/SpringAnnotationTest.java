package com.mimu.springtransactiondemo;


import com.simple.springtransactiondemo.CommonService;
import com.simple.springtransactiondemo.config.DataSourceConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class SpringAnnotationTest {

    public void info() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(DataSourceConfig.class);
        context.refresh();
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(DataSourceConfig.class);
        context.refresh();
        CommonService commonService = context.getBean(CommonService.class);
        System.out.println(commonService);
    }

}
