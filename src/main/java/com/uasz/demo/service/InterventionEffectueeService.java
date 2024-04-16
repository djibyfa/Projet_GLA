package com.uasz.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uasz.demo.modele.InterventionEffectuee;
import com.uasz.demo.repository.InterventionEffectueeRepository;

import java.util.List;

@Service
public class InterventionEffectueeService {
    @Autowired
    private InterventionEffectueeRepository interventionEffectueeRepository;

    public List<InterventionEffectuee> getAllInterventionEffectuees() {
        return interventionEffectueeRepository.findAll();
    }

    public InterventionEffectuee getInterventionEffectueeById(Long id) {
        return interventionEffectueeRepository.findById(id).orElse(null);
    }

    public InterventionEffectuee saveOrUpdateInterventionEffectuee(InterventionEffectuee interventionEffectuee) {
        return interventionEffectueeRepository.save(interventionEffectuee);
    }

    public void deleteInterventionEffectuee(Long id) {
        interventionEffectueeRepository.deleteById(id);
    }
}

