package com.project.systeme__gestion__location__vehicules.microservicegestionnaire.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "gestionnaire")
@Data
@NoArgsConstructor
@Getter
@Setter
public class Gestionnaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private int tel;
    private String email;
    private String password;

    public Gestionnaire(int id, String nom, String prenom, String adresse, int tel, String email, String password) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.email = email;
        this.password = password;
    }
}
