package com.example.Juego;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class JuegoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JuegoApplication.class, args);
	}

}
