package com.project.systeme__gestion__location__vehicules.microserviceavisevaluation.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "AvisEvaluation")
@Data
@NoArgsConstructor
@Getter
@Setter

public class AvisEvaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String evaluation;
    private String avis;

    public AvisEvaluation(int id, String evaluation, String avis ) {
        this.id = id;
        this.evaluation = evaluation;
        this.avis = avis;
    }
}
