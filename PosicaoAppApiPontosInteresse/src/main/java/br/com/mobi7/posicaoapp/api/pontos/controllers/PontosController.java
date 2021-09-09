package br.com.mobi7.posicaoapp.api.pontos.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pontos")
public class PontosController {

	@GetMapping("/status/check")
	public String status() {
		return "Pontos working";
	}
	
}
