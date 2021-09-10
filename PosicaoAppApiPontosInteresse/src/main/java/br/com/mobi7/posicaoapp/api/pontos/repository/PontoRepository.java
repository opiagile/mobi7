package br.com.mobi7.posicaoapp.api.pontos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.mobi7.posicaoapp.api.pontos.models.PontoInteresse;

public interface PontoRepository extends JpaRepository<PontoInteresse, Long>{

	@Query("from PontoInteresse p where upper(p.nome) like :nome")
    public PontoInteresse findByNome(String nome);

}
