package com.datajpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//adding new changes.
@RestController
public class Controller {
    @GetMapping("/welcome")
    public String strAdd(){
        return "Surendhar";
    }
}
