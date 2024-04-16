package com.uasz.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uasz.demo.modele.ValidationUtilisateur;
import com.uasz.demo.repository.ValidationUtilisateurRepository;

import java.util.List;

@Service
public class ValidationUtilisateurService {
    @Autowired
    private ValidationUtilisateurRepository validationUtilisateurRepository;

    public List<ValidationUtilisateur> getAllValidationsUtilisateur() {
        return validationUtilisateurRepository.findAll();
    }

    public ValidationUtilisateur getValidationUtilisateurById(Long id) {
        return validationUtilisateurRepository.findById(id).orElse(null);
    }

    public ValidationUtilisateur saveOrUpdateValidationUtilisateur(ValidationUtilisateur validationUtilisateur) {
        return validationUtilisateurRepository.save(validationUtilisateur);
    }

    public void deleteValidationUtilisateur(Long id) {
        validationUtilisateurRepository.deleteById(id);
    }
}

