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
public class ValidationUtilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int note;
    private String commentaire;
    private Date dateValidation;

    @ManyToOne
    @JoinColumn(name = "demande_intervention_id")
    private DemandeIntervention demandeIntervention;

}

