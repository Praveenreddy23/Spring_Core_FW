package com.springsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileUploadController {
    @RequestMapping(path = "/file")
    public String showFile(){
        return "fileform";
    }
}
