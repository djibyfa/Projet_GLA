package com.uasz.demo.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.uasz.demo.modele.InterventionEffectuee;
import com.uasz.demo.service.InterventionEffectueeService;

import java.util.List;

@RestController
@RequestMapping("/interventioneffectuee")
public class InterventionEffectueeRestController {
    @Autowired
    private InterventionEffectueeService interventionEffectueeService;

    @GetMapping("/")
    public List<InterventionEffectuee> getAllInterventionEffectuees() {
        return interventionEffectueeService.getAllInterventionEffectuees();
    }

    @GetMapping("/{id}")
    public InterventionEffectuee getInterventionEffectueeById(@PathVariable Long id) {
        return interventionEffectueeService.getInterventionEffectueeById(id);
    }

    @PostMapping("/")
    public InterventionEffectuee addInterventionEffectuee(@RequestBody InterventionEffectuee interventionEffectuee) {
        return interventionEffectueeService.saveOrUpdateInterventionEffectuee(interventionEffectuee);
    }

    @PutMapping("/{id}")
    public InterventionEffectuee updateInterventionEffectuee(@PathVariable Long id, @RequestBody InterventionEffectuee interventionEffectuee) {
        interventionEffectuee.setId(id);
        return interventionEffectueeService.saveOrUpdateInterventionEffectuee(interventionEffectuee);
    }

    @DeleteMapping("/{id}")
    public void deleteInterventionEffectuee(@PathVariable Long id) {
        interventionEffectueeService.deleteInterventionEffectuee(id);
    }
}

