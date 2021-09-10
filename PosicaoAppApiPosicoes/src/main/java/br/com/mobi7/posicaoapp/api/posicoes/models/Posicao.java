package br.com.mobi7.posicaoapp.api.posicoes.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Posicao {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private Long id;    
	
	@Column(name = "placa")
	private String placa;
	
	@Column(name = "data_posicao")
    private Date dataPosicao;
	
	@Column(name = "velocidade")
    private Integer velocidade;
	
	@Column(name = "latitude")
    private Double latitude;
	
	@Column(name = "longitude")
    private Double longitude;
	
	@Column(name = "ignicao")
    private Boolean ignicao;

    public Posicao() {
    }

	public Posicao(String placa, Date dataPosicao, Integer velocidade, Double latitude, Double longitude,
            Boolean ignicao) {
        this.placa = placa;
        this.dataPosicao = dataPosicao;
        this.velocidade = velocidade;
        this.latitude = latitude;
        this.longitude = longitude;
        this.ignicao = ignicao;
    }
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Date getDataPosicao() {
		return dataPosicao;
	}

	public void setDataPosicao(Date dataPosicao) {
		this.dataPosicao = dataPosicao;
	}

	public Integer getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(Integer velocidade) {
		this.velocidade = velocidade;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Boolean getIgnicao() {
		return ignicao;
	}

	public void setIgnicao(Boolean ignicao) {
		this.ignicao = ignicao;
	}
}
