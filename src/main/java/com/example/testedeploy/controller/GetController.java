package com.example.testedeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/teste")
@RestController
public class GetController {

    @GetMapping()
    public String olamundo(){
        System.out.println("Requisição realizada.");
        return "Isso funciona demais! Olá mundo do deploy!";
    }

}
