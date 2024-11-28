package com.project.systeme__gestion__location__vehicules.microserviceclient.Entity;

import jakarta.persistence.*;
import lombok.*;


@Table(name = "client")
@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String email;
    private String password;
    private String photoProfile;
    private String statut;
    private String permisDoc;
    private String ID_Licence_Date;
    private String ID_Licence_Expiry;
    private String ID_Licence;

    public Client(int id, String nom, String prenom, String adresse, String telephone, String email, String password,
                  String photoProfile, String statut, String permisDoc, String ID_Licence_Date,
                  String ID_Licence_Expiry, String ID_Licence ) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.password = password;
        this.photoProfile = photoProfile;
        this.statut = statut;
        this.permisDoc = permisDoc;
        this.ID_Licence_Date = ID_Licence_Date;
        this.ID_Licence_Expiry = ID_Licence_Expiry;
        this.ID_Licence = ID_Licence;
    }

}
