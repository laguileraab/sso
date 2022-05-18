package com.tramites.sso.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class AuthController {
    
    @GetMapping("/user")
    public String user(){
        return "User";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Admin";
    }

    @GetMapping("/guest")
    public String guest(){
        return "Guest";
    }

}
