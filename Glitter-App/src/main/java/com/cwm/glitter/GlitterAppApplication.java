package com.cwm.glitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.cwm.glitter.entity")
@EnableJpaRepositories("com.cwm.glitter.repository")
public class GlitterAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GlitterAppApplication.class, args);
	}

}
