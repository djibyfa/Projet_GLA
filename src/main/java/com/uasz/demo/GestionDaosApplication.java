package com.uasz.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uasz.demo.modele.Admin;
import com.uasz.demo.modele.DemandeIntervention;
import com.uasz.demo.modele.InterventionEffectuee;
import com.uasz.demo.modele.Personnel;
import com.uasz.demo.modele.Ressource;
import com.uasz.demo.modele.Utilisateur;
import com.uasz.demo.modele.ValidationUtilisateur;
import com.uasz.demo.service.AdminService;
import com.uasz.demo.service.DemandeInterventionService;
import com.uasz.demo.service.InterventionEffectueeService;
import com.uasz.demo.service.PersonnelService;
import com.uasz.demo.service.RessourceService;
import com.uasz.demo.service.UtilisateurService;
import com.uasz.demo.service.ValidationUtilisateurService;

@SpringBootApplication
public class GestionDaosApplication implements CommandLineRunner {

    @Autowired
    private AdminService adminService;

    @Autowired
    private UtilisateurService utilisateurService;

    @Autowired
    private ValidationUtilisateurService validationUtilisateurService;

    @Autowired
    private DemandeInterventionService demandeInterventionService;

	@Autowired
	private PersonnelService personnelService;

	@Autowired
	private RessourceService ressourceService;

	@Autowired
	private InterventionEffectueeService interventionEffectueeService;

    public static void main(String[] args) {
        SpringApplication.run(GestionDaosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Ajout de deux administrateurs
        Admin admin1 = new Admin();
        admin1.setNom("Admin1");
        admin1.setEmail("admin1@example.com");
        adminService.saveOrUpdateAdmin(admin1);

        Admin admin2 = new Admin();
        admin2.setNom("Admin2");
        admin2.setEmail("admin2@example.com");
        adminService.saveOrUpdateAdmin(admin2);

        // Ajout de deux utilisateurs
        Utilisateur user1 = new Utilisateur();
        user1.setNom("User1");
        user1.setEmail("user1@example.com");
        utilisateurService.saveOrUpdateUtilisateur(user1);

        Utilisateur user2 = new Utilisateur();
        user2.setNom("User2");
        user2.setEmail("user2@example.com");
        utilisateurService.saveOrUpdateUtilisateur(user2);

        // Ajout de deux validations utilisateur
        ValidationUtilisateur validation1 = new ValidationUtilisateur();
        validation1.setNote(5);
        validation1.setCommentaire("Très bon service.");
        validationUtilisateurService.saveOrUpdateValidationUtilisateur(validation1);

        ValidationUtilisateur validation2 = new ValidationUtilisateur();
        validation2.setNote(4);
        validation2.setCommentaire("Service satisfaisant.");
        validationUtilisateurService.saveOrUpdateValidationUtilisateur(validation2);

        // Ajout de deux demandes d'intervention
        DemandeIntervention demande1 = new DemandeIntervention();
        demande1.setDescription("Problème avec l'imprimante.");
        demande1.setPriorite("Haute");
        demandeInterventionService.saveOrUpdateDemandeIntervention(demande1);

        DemandeIntervention demande2 = new DemandeIntervention();
        demande2.setDescription("Erreur dans le logiciel.");
        demande2.setPriorite("Moyenne");
        demandeInterventionService.saveOrUpdateDemandeIntervention(demande2);
		// Ajout de deux membres du personnel technique
        Personnel tech1 = new Personnel();
        tech1.setNom("Technicien1");
        tech1.setEmail("technicien1@example.com");
        personnelService.saveOrUpdatePersonnelTechnique(tech1);

        Personnel tech2 = new Personnel();
        tech2.setNom("Technicien2");
        tech2.setEmail("technicien2@example.com");
        personnelService.saveOrUpdatePersonnelTechnique(tech2);

        // Ajout de deux ressources
        Ressource ressource1 = new Ressource();
        ressource1.setDescription("Imprimante HP");
        ressource1.setType("Matériel informatique");
        ressource1.setStatut("En attente d'intervention");
        ressourceService.saveOrUpdateRessource(ressource1);

        Ressource ressource2 = new Ressource();
        ressource2.setDescription("Logiciel de gestion");
        ressource2.setType("Logiciel");
        ressource2.setStatut("En attente d'intervention");
        ressourceService.saveOrUpdateRessource(ressource2);

        // Ajout de deux interventions effectuées
        InterventionEffectuee intervention1 = new InterventionEffectuee();
        intervention1.setDateIntervention(new Date());
        intervention1.setDescription("Remplacement du toner de l'imprimante.");
        intervention1.setDemandeIntervention(demande1);
        intervention1.setPersonnelTechnique(tech1);
        interventionEffectueeService.saveOrUpdateInterventionEffectuee(intervention1);

        InterventionEffectuee intervention2 = new InterventionEffectuee();
        intervention2.setDateIntervention(new Date());
        intervention2.setDescription("Mise à jour du logiciel de gestion.");
        intervention2.setDemandeIntervention(demande2);
        intervention2.setPersonnelTechnique(tech2);
        interventionEffectueeService.saveOrUpdateInterventionEffectuee(intervention2);
    
    }
}
