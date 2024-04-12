package com.uasz.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uasz.demo.modele.Ressource;
import com.uasz.demo.repository.RessourceRepository;

import java.util.List;

@Service
public class RessourceService {
    @Autowired
    private RessourceRepository ressourceRepository;

    public List<Ressource> getAllRessources() {
        return ressourceRepository.findAll();
    }

    public Ressource getRessourceById(Long id) {
        return ressourceRepository.findById(id).orElse(null);
    }

    public Ressource saveOrUpdateRessource(Ressource ressource) {
        return ressourceRepository.save(ressource);
    }

    public void deleteRessource(Long id) {
        ressourceRepository.deleteById(id);
    }
}

