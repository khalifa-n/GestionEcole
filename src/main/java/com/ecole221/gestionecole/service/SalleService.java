package com.ecole221.gestionecole.service;

import com.ecole221.gestionecole.model.Classe;
import com.ecole221.gestionecole.model.Professeur;
import com.ecole221.gestionecole.model.Salle;

import java.util.List;
import java.util.UUID;

public interface SalleService {
    List<Salle> getAll();
    Classe add(Salle salle);
    Classe update(Salle salle);
    Classe delete(UUID id);
}
