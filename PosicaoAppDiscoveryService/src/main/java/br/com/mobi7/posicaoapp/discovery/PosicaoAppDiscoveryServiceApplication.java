package br.com.mobi7.posicaoapp.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PosicaoAppDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosicaoAppDiscoveryServiceApplication.class, args);
	}

}
