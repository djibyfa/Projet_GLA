package com.uasz.demo.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.uasz.demo.modele.Personnel;
import com.uasz.demo.service.PersonnelService;

import java.util.List;

@RestController
@RequestMapping("/personneltechnique")
public class PersonnelRestController {
    @Autowired
    private PersonnelService personnelTechniqueService;

    @GetMapping("/")
    public List<Personnel> getAllPersonnelTechnique() {
        return personnelTechniqueService.getAllPersonnelTechnique();
    }

    @GetMapping("/{id}")
    public Personnel getPersonnelTechniqueById(@PathVariable Long id) {
        return personnelTechniqueService.getPersonnelTechniqueById(id);
    }

    @PostMapping("/")
    public Personnel addPersonnelTechnique(@RequestBody Personnel personnelTechnique) {
        return personnelTechniqueService.saveOrUpdatePersonnelTechnique(personnelTechnique);
    }

    @PutMapping("/{id}")
    public Personnel updatePersonnelTechnique(@PathVariable Long id, @RequestBody Personnel personnelTechnique) {
        personnelTechnique.setId(id);
        return personnelTechniqueService.saveOrUpdatePersonnelTechnique(personnelTechnique);
    }

    @DeleteMapping("/{id}")
    public void deletePersonnelTechnique(@PathVariable Long id) {
        personnelTechniqueService.deletePersonnelTechnique(id);
    }
}
