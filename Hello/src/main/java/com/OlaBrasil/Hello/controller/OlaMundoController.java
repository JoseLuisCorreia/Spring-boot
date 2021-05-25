package com.OlaBrasil.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/ola")
public class OlaMundoController {
	@GetMapping
	public String frase() {
		return "A a habilidade utilizada para realizar essa atividade foi a Orientação ao detalhe, e a mentalidade foi a de Persistência";
	}
}
