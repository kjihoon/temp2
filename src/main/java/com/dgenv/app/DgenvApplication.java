package com.dgenv.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.dgenv.*")
public class DgenvApplication {

	public static void main(String[] args) {
		SpringApplication.run(DgenvApplication.class, args);
	}

}

