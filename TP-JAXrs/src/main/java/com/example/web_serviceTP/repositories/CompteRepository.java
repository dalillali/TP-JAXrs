package com.example.web_serviceTP.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.web_serviceTP.entities.Compte;
import com.example.web_serviceTP.entities.TypeCompte;


public interface CompteRepository extends JpaRepository<Compte , Long> {
    List<Compte> findByType(TypeCompte type);
    List<Compte> findBySoldeGreaterThan(double solde);
}
