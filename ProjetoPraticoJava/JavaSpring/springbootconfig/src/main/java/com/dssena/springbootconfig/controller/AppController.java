package com.dssena.springbootconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/*
Usado a anotação @RestController para retornar a resposta através do body, a anotação @Value para
burcar o valor contido no app.message e a anotação @GetMapping para retornar nossa requisição do tipo
get no browser através da url localhost:8080/
Injetamos a variável de ambiente através da anotação @Value
 */
@RestController
public class AppController {

    @Value("${app.message}")
    private String appMessage;

    @GetMapping("/")
    public String getAppMessage(){
        return appMessage;
    }

    @Value("${ENV_DB_URL: NENHUMA}")
    private String dbVariavelAmbiente;

    @GetMapping("/envVariable")
    public String getDbVariavelAmbiente(){
        return "A seguinte variável de ambiente foi injetada: " + dbVariavelAmbiente;
    }
}
