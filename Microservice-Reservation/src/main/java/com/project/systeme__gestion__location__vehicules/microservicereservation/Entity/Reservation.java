package com.project.systeme__gestion__location__vehicules.microservicereservation.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "reservation")
@Data
@NoArgsConstructor
@Getter
@Setter
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private int prix;
    private String etat;
    private String fraitDeRetard;

    public Reservation(Long id, LocalDate dateDebut, LocalDate dateFin, int prix, String etat, String fraitDeRetard ) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.prix = prix;
        this.etat = etat;
        this.fraitDeRetard = fraitDeRetard;
    }

}
