package com.project.systeme__gestion__location__vehicules.microservicepaiement.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "paiement")
@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String statut;
    private int reservationID;
    private String montant;

    public Paiement(int id, String statut, int reservationID, String montant ) {
        this.id = id;
        this.statut = statut;
        this.reservationID = reservationID;
        this.montant = montant;
    }

}
