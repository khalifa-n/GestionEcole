package com.ecole221.gestionecole.service.implementation;

import com.ecole221.gestionecole.model.Classe;
import com.ecole221.gestionecole.model.Professeur;
import com.ecole221.gestionecole.service.ProfesseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class ProfesseurServiceImpl implements ProfesseurService {
    private final ProfesseurService professeurService;
@Autowired
    public ProfesseurServiceImpl(ProfesseurService professeurService) {
        this.professeurService = professeurService;
    }

    @Override
    public List<Professeur> getAll() {
        return null;
    }

    @Override
    public Classe add(Professeur professeur) {
        return null;
    }

    @Override
    public Classe update(Professeur professeur) {
        return null;
    }

    @Override
    public Classe delete(UUID id) {
        return null;
    }
}
