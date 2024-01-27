package com.ecole221.gestionecole.repository;

import com.ecole221.gestionecole.model.Classe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClasseRepository extends JpaRepository<Classe, UUID> {
}
