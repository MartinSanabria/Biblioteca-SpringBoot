package com.example.blibliotecaSp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlibliotecaSpApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BlibliotecaSpApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Swagger UI: http://localhost:8080/swagger-ui/index.html");
	}

}
