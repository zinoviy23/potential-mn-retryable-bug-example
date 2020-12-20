package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

@Controller
public class MyController {
    @Inject
    private MyBean bean;

    @Get
    String a() {
        bean.a();
        return bean.toString();
    }
}
