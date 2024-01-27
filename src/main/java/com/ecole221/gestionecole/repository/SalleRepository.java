package com.ecole221.gestionecole.repository;

import com.ecole221.gestionecole.model.Salle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SalleRepository extends JpaRepository<Salle, UUID> {
}
