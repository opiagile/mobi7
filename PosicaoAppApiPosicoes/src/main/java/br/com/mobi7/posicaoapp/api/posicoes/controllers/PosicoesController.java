package br.com.mobi7.posicaoapp.api.posicoes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posicoes")
public class PosicoesController {

	@GetMapping("/status/check")
	public String status() {
		return "Posicoes working";
	}

}
