package com.example.compte_api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double solde;

    private String dateCreation;

    private String type;
}