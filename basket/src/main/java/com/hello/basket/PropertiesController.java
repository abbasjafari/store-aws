package com.hello.basket;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class PropertiesController {

    @Value("${some.other.property}")
    String environment;

    @RequestMapping
    public String printConfig() {
        return environment;
    }

}
