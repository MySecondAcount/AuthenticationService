package com.atypon.authenticationservice;


import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationServiceController {
    @PostMapping("/login")
    public boolean authenticate(@RequestBody UserInfo userInfo) {
        if (userInfo.getEmail().equals("admin1@gmail.com") && userInfo.getPassword().equals("123456")) {
            return true;
        } else {
            return false;
        }
    }
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
