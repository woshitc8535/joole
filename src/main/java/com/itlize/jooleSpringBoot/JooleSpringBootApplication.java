package com.itlize.jooleSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JooleSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JooleSpringBootApplication.class, args);
	}

}
