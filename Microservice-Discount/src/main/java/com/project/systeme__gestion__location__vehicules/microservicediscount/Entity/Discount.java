package com.project.systeme__gestion__location__vehicules.microservicediscount.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "Discount")
@Data
@NoArgsConstructor
@Getter
@Setter
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String image;
    private double montantDeReduction;
    private LocalDate dateLimite;
    private String statut;

    private Discount(int id, String nom, String image, double montantDeReduction, LocalDate dateLimite, String statut){
        this.id = id;
        this.nom = nom;
        this.image = image;
        this.montantDeReduction = montantDeReduction;
        this.dateLimite = dateLimite;
        this.statut = statut;
    }
}
