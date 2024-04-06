package com.uasz.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uasz.demo.modele.Personnel;
import com.uasz.demo.repository.PersonnelRepository;

import java.util.List;

@Service
public class PersonnelService {
    @Autowired
    private PersonnelRepository personnelRepository;

    public List<Personnel> getAllPersonnelTechnique() {
        return personnelRepository.findAll();
    }

    public Personnel getPersonnelTechniqueById(Long id) {
        return personnelRepository.findById(id).orElse(null);
    }

    public Personnel saveOrUpdatePersonnelTechnique(Personnel personnelTechnique) {
        return personnelRepository.save(personnelTechnique);
    }

    public void deletePersonnelTechnique(Long id) {
        personnelRepository.deleteById(id);
    }
}

