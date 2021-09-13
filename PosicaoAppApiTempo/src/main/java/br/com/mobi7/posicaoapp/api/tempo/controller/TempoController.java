package br.com.mobi7.posicaoapp.api.tempo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.mobi7.posicaoapp.api.tempo.models.Tempo;
import br.com.mobi7.posicaoapp.api.tempo.repository.TempoRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/tempo")
public class TempoController {

	@Autowired
	TempoRepository tempoRepository;

	@GetMapping("/status/check")
	public String status() {
		return "Tempo working";
	}
	
	@GetMapping("/tempo-ponto-interesse")
	public List<Tempo> getPontoCalcTempo(@RequestParam(required = false) String placa,
			@RequestParam(required = false) Date dataIni, @RequestParam(required = false) Date dataFin) {
		return tempoRepository.getListTempoCalculado(placa, dataIni, dataFin);
	}
	
}
