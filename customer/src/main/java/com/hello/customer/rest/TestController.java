package com.hello.customer.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer/api/v1/")
public class TestController {

    @RequestMapping("{name}")
    public String test(@PathVariable("name") String name){
        return "Hello Word :"+ name;
    }
}
