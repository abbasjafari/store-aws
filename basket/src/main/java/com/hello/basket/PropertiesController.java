package com.hello.basket;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {
    @Autowired
    private ConfigClientAppConfiguration properties;

    @Value("environment")
    String environment;

    @RequestMapping
    public String printConfig(){
        return environment;
    }

}
