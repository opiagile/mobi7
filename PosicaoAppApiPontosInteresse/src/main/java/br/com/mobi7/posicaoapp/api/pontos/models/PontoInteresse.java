package br.com.mobi7.posicaoapp.api.pontos.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PontoInteresse {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private Long id;
	
	@Column(name = "nome")
    private String nome;
    
	@Column(name = "raio")
    private Integer raio;
    
	@Column(name = "latitude")
    private Double latitude;
    
	@Column(name = "longitude")
    private Double longitude;

    public PontoInteresse(String nome, Integer raio, Double latitude, Double longitude) {
        this.nome = nome;
        this.raio = raio;
        this.latitude = latitude;
        this.longitude = longitude;
    }
	
    public PontoInteresse() {
        
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getRaio() {
		return raio;
	}

	public void setRaio(Integer raio) {
		this.raio = raio;
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
}
