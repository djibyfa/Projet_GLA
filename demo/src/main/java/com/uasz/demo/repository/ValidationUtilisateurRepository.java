package com.uasz.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uasz.demo.modele.ValidationUtilisateur;

public interface ValidationUtilisateurRepository extends JpaRepository<ValidationUtilisateur,Long>{
    
}
