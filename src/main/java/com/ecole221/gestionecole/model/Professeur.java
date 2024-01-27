package com.ecole221.gestionecole.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "professeur")

public class Professeur {
    @Id @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;
    private String nom;
    private String prenom;
    private String specialite;
}
