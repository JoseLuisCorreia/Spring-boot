package com.Objetivos.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/rota")
public class ObjetivosController {

	@GetMapping
	public String objetv() {
		return "Praticar bastante as atividades de Spring Boot e tudo o quer for passado pelo professor para internalizar o aprendizado.";
	}
}
