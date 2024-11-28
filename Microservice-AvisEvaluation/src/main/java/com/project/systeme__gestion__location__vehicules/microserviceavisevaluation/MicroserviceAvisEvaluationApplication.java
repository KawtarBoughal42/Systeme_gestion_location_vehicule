package com.project.systeme__gestion__location__vehicules.microserviceavisevaluation;

import com.project.systeme__gestion__location__vehicules.microserviceavisevaluation.Entity.AvisEvaluation;
import com.project.systeme__gestion__location__vehicules.microserviceavisevaluation.Repository.AvisEvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroserviceAvisEvaluationApplication implements CommandLineRunner {

    @Autowired
    private AvisEvaluationRepository avisEvaluationRepository;

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceAvisEvaluationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        AvisEvaluation avis = new AvisEvaluation();
        avis.setEvaluation("5 étoiles");
        avis.setAvis("Excellent service, très satisfait.");

        avisEvaluationRepository.save(avis);

        System.out.println("Les avis et évaluations ont été ajoutés à la base de données.");
    }

}
