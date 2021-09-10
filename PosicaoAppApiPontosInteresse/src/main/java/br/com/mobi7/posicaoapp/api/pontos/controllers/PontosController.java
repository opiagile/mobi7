package br.com.mobi7.posicaoapp.api.pontos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.mobi7.posicaoapp.api.pontos.models.PontoInteresse;
import br.com.mobi7.posicaoapp.api.pontos.repository.PontoRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/pontos")
public class PontosController {

	@Autowired
	PontoRepository pontoRepository;

	@GetMapping("/status/check")
	public String status() {
		return "Pontos working";
	}

	@GetMapping
	public List<PontoInteresse> listarTodos() {
		return pontoRepository.findAll();
	}

	@GetMapping("/ponto-interesse-por-nome")
	public PontoInteresse findByNome(@RequestParam(required = false) String nome) {
		return pontoRepository.findByNome(nome);
	}

}
