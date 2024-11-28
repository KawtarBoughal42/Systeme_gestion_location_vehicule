package com.project.systeme__gestion__location__vehicules.microserviceagence.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "agence")
@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String image;
    private String nomEntreprise;
    private String prenom;
    private String adresse;
    private int tel;
    private String proprietaire;
    private String description;
    private String website;
    private String compteFacebook;
    private String compteInstagram;

    public Agence(Long id, String image, String nomEntreprise, String prenom, String adresse, int tel,
                  String proprietaire, String description, String website, String compteFacebook,
                  String compteInstagram) {
        this.id = id;
        this.image = image;
        this.nomEntreprise = nomEntreprise;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.proprietaire = proprietaire;
        this.description = description;
        this.website = website;
        this.compteFacebook = compteFacebook;
        this.compteInstagram = compteInstagram;
    }
}
