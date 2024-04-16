package com.uasz.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uasz.demo.modele.DemandeIntervention;

public interface DemandeInterventionRepository extends JpaRepository<DemandeIntervention,Long> {
    
}
