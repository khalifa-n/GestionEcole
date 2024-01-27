package com.ecole221.gestionecole.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProfesseurRepository extends JpaRepository<ProfesseurRepository, UUID> {
}
