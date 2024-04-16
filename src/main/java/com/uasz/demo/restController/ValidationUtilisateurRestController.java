package com.uasz.demo.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.uasz.demo.modele.ValidationUtilisateur;
import com.uasz.demo.service.ValidationUtilisateurService;

import java.util.List;

@RestController
@RequestMapping("/validationutilisateur")
public class ValidationUtilisateurRestController {
    @Autowired
    private ValidationUtilisateurService validationUtilisateurService;

    @GetMapping("/")
    public List<ValidationUtilisateur> getAllValidationsUtilisateur() {
        return validationUtilisateurService.getAllValidationsUtilisateur();
    }

    @GetMapping("/{id}")
    public ValidationUtilisateur getValidationUtilisateurById(@PathVariable Long id) {
        return validationUtilisateurService.getValidationUtilisateurById(id);
    }

    @PostMapping("/")
    public ValidationUtilisateur addValidationUtilisateur(@RequestBody ValidationUtilisateur validationUtilisateur) {
        return validationUtilisateurService.saveOrUpdateValidationUtilisateur(validationUtilisateur);
    }

    @PutMapping("/{id}")
    public ValidationUtilisateur updateValidationUtilisateur(@PathVariable Long id, @RequestBody ValidationUtilisateur validationUtilisateur) {
        validationUtilisateur.setId(id);
        return validationUtilisateurService.saveOrUpdateValidationUtilisateur(validationUtilisateur);
    }

    @DeleteMapping("/{id}")
    public void deleteValidationUtilisateur(@PathVariable Long id) {
        validationUtilisateurService.deleteValidationUtilisateur(id);
    }
}

