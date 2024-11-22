package com.example.web_serviceTP;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.web_serviceTP.entities.Compte;
import com.example.web_serviceTP.entities.TypeCompte;
import com.example.web_serviceTP.repositories.CompteRepository;

@SpringBootApplication
public class WebServiceTpApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebServiceTpApplication.class, args);
	}
	@Bean
    CommandLineRunner start(CompteRepository compteRepository) {
        return args -> {
            compteRepository.save(new Compte(null, Math.random() * 9000, new Date(), TypeCompte.EPARGNE));
            compteRepository.save(new Compte(null, Math.random() * 9000, new Date(), TypeCompte.COURANT));
            compteRepository.save(new Compte(null, Math.random() * 9000, new Date(), TypeCompte.EPARGNE));
            compteRepository.findAll().forEach(c -> {
                System.out.println(c.toString());
            });
        };
    }

}
