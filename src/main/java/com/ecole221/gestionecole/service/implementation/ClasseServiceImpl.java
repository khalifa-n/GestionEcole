package com.ecole221.gestionecole.service.implementation;


import com.ecole221.gestionecole.model.Classe;
import com.ecole221.gestionecole.service.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.UUID;
@Service
public class ClasseServiceImpl implements ClasseService {
private final ClasseService classeService;
@Autowired
    public ClasseServiceImpl(ClasseService classeService) {
        this.classeService = classeService;
    }

    @Override
    public List<Classe> getAll() {
        return Collections.emptyList();
    }

    @Override
    public Classe add(Classe classe) {
        return null;
    }

    @Override
    public Classe update(Classe classe) {
        return null;
    }

    @Override
    public Classe delete(UUID id) {
        return null;
    }
}
