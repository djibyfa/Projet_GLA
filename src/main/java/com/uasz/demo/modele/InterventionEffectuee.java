package com.uasz.demo.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterventionEffectuee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateIntervention;
    private String description;

    @ManyToOne
    @JoinColumn(name = "demande_intervention_id")
    private DemandeIntervention demandeIntervention;

    @ManyToOne
    @JoinColumn(name = "personnel_technique_id")
    private Personnel personnelTechnique;

    // Getters and setters
}

