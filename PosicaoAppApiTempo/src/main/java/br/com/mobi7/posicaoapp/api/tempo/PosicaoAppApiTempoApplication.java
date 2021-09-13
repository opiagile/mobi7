package br.com.mobi7.posicaoapp.api.tempo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PosicaoAppApiTempoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosicaoAppApiTempoApplication.class, args);
	}

}
