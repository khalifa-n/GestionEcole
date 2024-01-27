package com.ecole221.gestionecole.service;

import com.ecole221.gestionecole.model.Eleve;

import java.util.List;
import java.util.UUID;

public interface EleveService {
    List<Eleve> getAll();
    Eleve add(Eleve eleve);
    boolean update(Eleve eleve);
    boolean delete(UUID id);
}
