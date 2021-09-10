package br.com.mobi7.posicaoapp.api.posicoes.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.mobi7.posicaoapp.api.posicoes.models.Posicao;

public interface PosicaoRepository extends JpaRepository<Posicao, Long>{

	@Query("from Posicao p where p.dataPosicao between :dataIni and :dataFin")
    public List<Posicao> getListByData(Date dataIni, Date dataFin);

    @Query("from Posicao p where p.placa = :placa and p.dataPosicao between :dataIni and :dataFin")
    public List<Posicao> getListByPlacaData(String placa, Date dataIni, Date dataFin);

    @Query("select distinct p.placa from Posicao p order by p.placa")
    public List<String> listAllPlacas();

}
