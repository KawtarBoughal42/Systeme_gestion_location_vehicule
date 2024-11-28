package com.project.systeme__gestion__location__vehicules.microservicemarque.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "marque")
@Data
@NoArgsConstructor
@Getter
@Setter
public class Marque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String image;

    public Marque(Long id, String nom, String image) {
        this.id = id;
        this.nom = nom;
        this.image = image;
    }
}
