package com.project.systeme__gestion__location__vehicules.microserviceadministrateur.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="administrateur")
@Data
@NoArgsConstructor
@Getter
@Setter

public class Administrateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String adresse;
    private int tel;
    private String email;
    private String password;

    public Administrateur(Long id, String nom, String prenom, String adresse, int tel,
                  String email, String password ) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.email = email;
        this.password = password;
    }
}
