package com.lester.web;

import com.lester.core.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private ServiceImpl service;

    @RequestMapping("/hello")
    public String index() {
        return service.shit();
    }

}
