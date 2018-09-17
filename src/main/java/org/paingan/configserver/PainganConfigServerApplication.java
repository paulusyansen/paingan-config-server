package org.paingan.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PainganConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PainganConfigServerApplication.class, args);
	}
}
