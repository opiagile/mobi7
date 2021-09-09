package br.com.mobi7.posicaoapp.api.posicoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PosicaoAppApiPosicoesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosicaoAppApiPosicoesApplication.class, args);
	}

}
