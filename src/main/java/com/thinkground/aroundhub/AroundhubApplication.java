package com.thinkground.aroundhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing//createdAt, updatedAt, BaseEntity.class 어노테이션참고
public class AroundhubApplication {

	public static void main(String[] args) {
		SpringApplication.run(AroundhubApplication.class, args);
	}

}
