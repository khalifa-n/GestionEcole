package com.ecole221.gestionecole.service.implementation;

import com.ecole221.gestionecole.model.Eleve;
import com.ecole221.gestionecole.repository.EleveRepository;
import com.ecole221.gestionecole.service.EleveService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
@Transactional
public class EleveServiceImpl implements EleveService {
    private final EleveRepository eleveRepository;

    @Autowired
    public EleveServiceImpl(EleveRepository eleveRepository) {
        this.eleveRepository = eleveRepository;
    }

    @Override
    public List<Eleve> getAll() {
        return eleveRepository.findAll();
    }

    @Override
    public Eleve add(Eleve eleve) {
        return eleveRepository.save(eleve);
    }

    @Override
    public boolean update(Eleve eleve) {
        Optional<Eleve> existingEleveOptional = eleveRepository.findById(eleve.getId());

        if (existingEleveOptional.isPresent()) {
            Eleve existingEleve = existingEleveOptional.get();
            // Update the fields of the existingEleve with the values from updatedEleve
            existingEleve.setNom(eleve.getNom());
            existingEleve.setPrenom(eleve.getPrenom());
            // Save the updatedEleve
            eleveRepository.save(existingEleve);
            return true;
        } else {
            // Return false if the Eleve with the given ID is not found
            return false;
        }
    }

    @Override
    public boolean delete(UUID id) {
        Optional<Eleve> eleveToDeleteOptional = eleveRepository.findById(id);

        if (eleveToDeleteOptional.isPresent()) {
            // Delete the eleve from the repository
            eleveRepository.delete(eleveToDeleteOptional.get());
            return true;
        } else {
            // Return false if the Eleve with the given ID is not found
            return false;
        }
    }
}