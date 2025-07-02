package com.ecommerce.simplewebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

@RequestMapping("/")

    public String greet(){
        return "welcome to my app";
    }
@RequestMapping("/about")
    public String about(){
      return "we don't teach , we educate !!";
    }
}

