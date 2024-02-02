package com.msp.springboot.sapp.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringbootServicioEconfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioEconfigServerApplication.class, args);
	}

}
