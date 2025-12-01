package com.example.compte_api.repositories;

import com.example.compte_api.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}