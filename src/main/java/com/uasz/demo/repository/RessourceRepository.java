package com.uasz.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uasz.demo.modele.Ressource;

public interface RessourceRepository extends JpaRepository<Ressource,Long> {
    
}
