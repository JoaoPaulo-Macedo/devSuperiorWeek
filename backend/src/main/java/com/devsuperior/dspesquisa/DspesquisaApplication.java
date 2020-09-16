package com.devsuperior.dspesquisa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DspesquisaApplication {
	//In Java, the classes must have the same name as the file.
	
	public static void main(String[] args) {
		//main method is the entry point of your Java application,
		//just as in many other languages.
		
		SpringApplication.run(DspesquisaApplication.class, args);
		//Just like runApp() from Flutter, this method initialize
		//a Spring application.
	}
}
