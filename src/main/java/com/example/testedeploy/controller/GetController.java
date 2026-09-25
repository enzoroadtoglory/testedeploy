package com.example.testedeploy.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/teste")
@RestController
public class GetController {

    @GetMapping()
    public String olamundo(){
        System.out.println("Requisição realizada.");
        return "Isso funciona demais! Olá mundo do deploy!";
    }

    @PostMapping("/enviar")
    public void receber(@RequestBody String nome){
        System.out.println("Olá "+nome+"! Seja bem vindo ao meu primeiro deploy!");
    }

}
