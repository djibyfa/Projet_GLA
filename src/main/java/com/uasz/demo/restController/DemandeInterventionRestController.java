package com.uasz.demo.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.uasz.demo.modele.DemandeIntervention;
import com.uasz.demo.service.DemandeInterventionService;

import java.util.List;

@RestController
@RequestMapping("/demandeintervention")
public class DemandeInterventionRestController {
    @Autowired
    private DemandeInterventionService demandeInterventionService;

    @GetMapping("/")
    public List<DemandeIntervention> getAllDemandeInterventions() {
        return demandeInterventionService.getAllDemandeInterventions();
    }

    @GetMapping("/{id}")
    public DemandeIntervention getDemandeInterventionById(@PathVariable Long id) {
        return demandeInterventionService.getDemandeInterventionById(id);
    }

    @PostMapping("/")
    public DemandeIntervention addDemandeIntervention(@RequestBody DemandeIntervention demandeIntervention) {
        return demandeInterventionService.saveOrUpdateDemandeIntervention(demandeIntervention);
    }

    @PutMapping("/{id}")
    public DemandeIntervention updateDemandeIntervention(@PathVariable Long id, @RequestBody DemandeIntervention demandeIntervention) {
        demandeIntervention.setId(id);
        return demandeInterventionService.saveOrUpdateDemandeIntervention(demandeIntervention);
    }

    @DeleteMapping("/{id}")
    public void deleteDemandeIntervention(@PathVariable Long id) {
        demandeInterventionService.deleteDemandeIntervention(id);
    }
}
