package com.example.compte_api.services;

import com.example.compte_api.entities.Compte;
import com.example.compte_api.repositories.CompteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompteService {

    private final CompteRepository repository;

    public List<Compte> getAll() {
        return repository.findAll();
    }

    public Compte save(Compte c) {
        return repository.save(c);
    }
}