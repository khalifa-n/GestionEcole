package com.ecole221.gestionecole.service;

import com.ecole221.gestionecole.model.Classe;

import java.util.List;
import java.util.UUID;

public interface ClasseService {
    List<Classe> getAll();
    Classe add(Classe classe);
    Classe update(Classe classe);
    Classe delete(UUID id);
}
