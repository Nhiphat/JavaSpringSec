package com.adminportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String Index(){
        return "redirect:/home";
    }
    @RequestMapping("/home")
    public String Home(){
        return "home";
    }
    @RequestMapping("/login")
    public String Login(){
        return "login";
    }
}
