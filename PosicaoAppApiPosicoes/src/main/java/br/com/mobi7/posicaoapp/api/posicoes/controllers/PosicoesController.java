package br.com.mobi7.posicaoapp.api.posicoes.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.mobi7.posicaoapp.api.posicoes.models.Posicao;
import br.com.mobi7.posicaoapp.api.posicoes.repository.PosicaoRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/posicoes")
public class PosicoesController {

	@Autowired
	PosicaoRepository posicaoRepository;

	@GetMapping("/status/check")
	public String status() {
		return "Posicoes working";
	}

	@GetMapping
	public List<Posicao> listarTodos() {
		return posicaoRepository.findAll();
	}

	@GetMapping("/placas")
	public List<String> getPlacas() {
		return posicaoRepository.listAllPlacas();
	}

	@GetMapping("/posicao-por-placa-data")
	public List<Posicao> posicaoByPlacaData(@RequestParam(required = false) String placa,
			@RequestParam(required = false) Date dataIni, @RequestParam(required = false) Date dataFin) {
		return posicaoRepository.getListByPlacaData(placa, dataIni, dataFin);
	}

	@GetMapping("/posicao-por-data")
	public List<Posicao> posicaoByData(@RequestParam(required = false) Date dataIni,
			@RequestParam(required = false) Date dataFin) {
		return posicaoRepository.getListByData(dataIni, dataFin);
	}

}
