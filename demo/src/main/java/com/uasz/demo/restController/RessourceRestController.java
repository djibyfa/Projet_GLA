package com.uasz.demo.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.uasz.demo.modele.Ressource;
import com.uasz.demo.service.RessourceService;

import java.util.List;

@RestController
@RequestMapping("/ressource")
public class RessourceRestController {
    @Autowired
    private RessourceService ressourceService;

    @GetMapping("/")
    public List<Ressource> getAllRessources() {
        return ressourceService.getAllRessources();
    }

    @GetMapping("/{id}")
    public Ressource getRessourceById(@PathVariable Long id) {
        return ressourceService.getRessourceById(id);
    }

    @PostMapping("/")
    public Ressource addRessource(@RequestBody Ressource ressource) {
        return ressourceService.saveOrUpdateRessource(ressource);
    }

    @PutMapping("/{id}")
    public Ressource updateRessource(@PathVariable Long id, @RequestBody Ressource ressource) {
        ressource.setId(id);
        return ressourceService.saveOrUpdateRessource(ressource);
    }

    @DeleteMapping("/{id}")
    public void deleteRessource(@PathVariable Long id) {
        ressourceService.deleteRessource(id);
    }
}

