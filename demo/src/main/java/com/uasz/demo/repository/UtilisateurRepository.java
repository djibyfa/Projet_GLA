package com.uasz.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uasz.demo.modele.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
    
}
