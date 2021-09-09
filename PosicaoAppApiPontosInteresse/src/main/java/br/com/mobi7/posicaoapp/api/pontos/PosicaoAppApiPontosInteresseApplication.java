package br.com.mobi7.posicaoapp.api.pontos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PosicaoAppApiPontosInteresseApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosicaoAppApiPontosInteresseApplication.class, args);
	}

}
