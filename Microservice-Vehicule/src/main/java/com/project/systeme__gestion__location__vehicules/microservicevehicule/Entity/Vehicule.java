package com.project.systeme__gestion__location__vehicules.microservicevehicule.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "vehicule")
@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomV;
    private String imagesV;
    private String item;
    private String sieges;
    private String airbags;
    private String couleur;
    private String annee;
    private String prix;
    private String status;
    private String description;
    private String transmission;
    private String plaqueImmat;
    private String typeCarburant;

    public Vehicule(Long id, String nomV, String imagesV, String item, String sieges, String airbags, String couleur,
                    String annee, String prix, String status, String description, String transmission, String plaqueImmat,
                    String typeCarburant ) {
        this.id = id;
        this.nomV = nomV;
        this.imagesV = imagesV;
        this.item = item;
        this.sieges = sieges;
        this.airbags = airbags;
        this.couleur = couleur;
        this.annee = annee;
        this.prix = prix;
        this.status = status;
        this.description = description;
        this.transmission = transmission;
        this.plaqueImmat = plaqueImmat;
        this.typeCarburant = typeCarburant;
    }

}
