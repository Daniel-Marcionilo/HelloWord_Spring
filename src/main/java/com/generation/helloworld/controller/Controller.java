package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entregas")
public class Controller {
	@GetMapping("/helloworld")
	public String hello() {
		return "Hello World!";
	}
	@GetMapping("/bsms")
	public String bsm() {
		return "Gestão do Tempo, Orientação ao Futuro, Mentalidades";
	}
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Trabalhar em Equipe, Spring Boot, CRUD";
	}
}
