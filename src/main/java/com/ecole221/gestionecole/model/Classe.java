package com.ecole221.gestionecole.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "classe")
public class Classe {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libelle;
}
