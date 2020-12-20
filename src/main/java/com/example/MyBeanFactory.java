package com.example;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.EachBean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.retry.annotation.Retryable;

import javax.inject.Singleton;

@Factory
public class MyBeanFactory {
    @Singleton
    @Bean(preDestroy = "close")
    @Retryable
    MyBean createBean(MyClass1 a) {
        System.out.println(a);
        System.out.println("attempt");
        throw new RuntimeException("(((");
    }
}
