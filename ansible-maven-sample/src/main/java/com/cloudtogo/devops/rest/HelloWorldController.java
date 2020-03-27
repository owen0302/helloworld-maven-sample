package com.cloudtogo.devops.rest;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    
    @RequestMapping(value="hello/{name}")
    public String helloWorld(@PathVariable String name){
        return name;
    }
}