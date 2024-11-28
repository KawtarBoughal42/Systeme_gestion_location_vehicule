package com.project.systeme__gestion__location__vehicules.microservicecontact.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "contact")
@Data
@NoArgsConstructor
@Getter
@Setter

public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String message;

    public Contact(Long id, String nom, String prenom, String email, String message){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.message = message;
    }

}
