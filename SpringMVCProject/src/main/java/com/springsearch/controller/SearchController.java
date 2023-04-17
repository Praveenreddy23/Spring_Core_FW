package com.springsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

    @RequestMapping(path = "/home")
    public String home(){
        System.out.println("Welcome to Home Page");
//        Exception Handling
        String s = null;
        System.out.println(s.length());
        return"home";
    }

    @RequestMapping(path = "/search")
    public RedirectView search(@RequestParam("query") String query){

        String url = "https://www.google.com/search?q= "+query;

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(url);
        return redirectView;
    }
//    Handling Exception
    @ExceptionHandler({NullPointerException.class, NumberFormatException.class})
    public String exceptionHandler(){
        return "null-page";
    }



}
