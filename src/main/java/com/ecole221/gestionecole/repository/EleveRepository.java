package com.ecole221.gestionecole.repository;

import com.ecole221.gestionecole.model.Eleve;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface EleveRepository extends JpaRepository<Eleve, UUID> {
    Optional<Eleve> findById(Long id);
}
