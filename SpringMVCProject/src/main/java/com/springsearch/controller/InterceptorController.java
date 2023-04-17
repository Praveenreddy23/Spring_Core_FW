package com.springsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterceptorController {

    @RequestMapping(path = "/incon")
    public String inController(){
        System.out.println("Im Interceptor Controller");
        return"interceptor";
    }

    @RequestMapping(path = "/interceptor")
    public String inHandle(@RequestParam("user") String name, Model model){

        System.out.println("User is: "+name);
        model.addAttribute("key",name);
        System.out.println("Im Interceptor Handler");
        return"destination";


    }
}
