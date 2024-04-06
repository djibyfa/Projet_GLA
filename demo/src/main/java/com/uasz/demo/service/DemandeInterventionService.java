package com.uasz.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uasz.demo.modele.DemandeIntervention;
import com.uasz.demo.repository.DemandeInterventionRepository;

import java.util.List;

@Service
public class DemandeInterventionService {
    @Autowired
    private DemandeInterventionRepository demandeInterventionRepository;

    public List<DemandeIntervention> getAllDemandeInterventions() {
        return demandeInterventionRepository.findAll();
    }

    public DemandeIntervention getDemandeInterventionById(Long id) {
        return demandeInterventionRepository.findById(id).orElse(null);
    }

    public DemandeIntervention saveOrUpdateDemandeIntervention(DemandeIntervention demandeIntervention) {
        return demandeInterventionRepository.save(demandeIntervention);
    }

    public void deleteDemandeIntervention(Long id) {
        demandeInterventionRepository.deleteById(id);
    }
}

