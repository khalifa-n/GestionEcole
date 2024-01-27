package com.ecole221.gestionecole.service;

import com.ecole221.gestionecole.model.Classe;
import com.ecole221.gestionecole.model.Eleve;
import com.ecole221.gestionecole.model.Professeur;

import java.util.List;
import java.util.UUID;

public interface ProfesseurService {
    List<Professeur> getAll();
    Classe add(Professeur professeur);
    Classe update(Professeur professeur);
    Classe delete(UUID id);
}
