package com.ideabag.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
//@Component("myServiceSimple")
public class MyService implements IService {
    public String operacion() {
        return "Ejecutando algún proceso importante simple...";
    }
}