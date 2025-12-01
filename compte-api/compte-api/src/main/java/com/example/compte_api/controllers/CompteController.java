package com.example.compte_api.controllers;

import com.example.compte_api.entities.Compte;
import com.example.compte_api.services.CompteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comptes")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class CompteController {

    private final CompteService service;

    @GetMapping
    public List<Compte> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Compte create(@RequestBody Compte compte) {
        return service.save(compte);
    }
}