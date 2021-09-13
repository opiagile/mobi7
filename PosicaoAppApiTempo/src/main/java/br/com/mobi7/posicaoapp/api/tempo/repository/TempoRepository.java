package br.com.mobi7.posicaoapp.api.tempo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.mobi7.posicaoapp.api.tempo.models.Tempo;

@Repository
public class TempoRepository {

	public List<Tempo> getListTempoCalculado(String placa, Date dataIni, Date dataFin){
		return null;		
	}
}
