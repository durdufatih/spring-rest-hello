package com.fatihdurdu.restapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fatihdurdu on 7/22/17.
 */
@RestController
public class HelloWorldController {

    @RequestMapping(value = "/hello")
    public String helloWorld(){
        return "Hello World";
    }
}
