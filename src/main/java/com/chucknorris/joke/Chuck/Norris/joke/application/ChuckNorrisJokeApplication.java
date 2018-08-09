package com.chucknorris.joke.Chuck.Norris.joke.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class ChuckNorrisJokeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChuckNorrisJokeApplication.class, args);
	}
}
