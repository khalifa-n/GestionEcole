package com.ecole221.gestionecole.service.implementation;

import com.ecole221.gestionecole.model.Classe;
import com.ecole221.gestionecole.model.Salle;
import com.ecole221.gestionecole.service.SalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class SalleServiceImpl implements SalleService {
    private final SalleService salleService;
@Autowired
    public SalleServiceImpl(SalleService salleService) {
        this.salleService = salleService;
    }

    @Override
    public List<Salle> getAll() {
        return null;
    }

    @Override
    public Classe add(Salle salle) {
        return null;
    }

    @Override
    public Classe update(Salle salle) {
        return null;
    }

    @Override
    public Classe delete(UUID id) {
        return null;
    }
}
