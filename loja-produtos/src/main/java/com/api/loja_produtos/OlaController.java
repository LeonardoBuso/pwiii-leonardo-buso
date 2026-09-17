package com.api.loja_produtos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {

    @GetMapping("/")
    public String mensagem() {
        return "Olá, Pequeno Gafanhoto! Meu projeto Spring Boot está funcionando, apesar de não saber muito bem como utilizar java!";
    }
}
