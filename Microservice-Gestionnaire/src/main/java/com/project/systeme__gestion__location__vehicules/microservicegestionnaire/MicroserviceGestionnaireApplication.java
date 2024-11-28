package com.project.systeme__gestion__location__vehicules.microservicegestionnaire;

import com.project.systeme__gestion__location__vehicules.microservicegestionnaire.Entity.Gestionnaire;
import com.project.systeme__gestion__location__vehicules.microservicegestionnaire.Repository.GestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroserviceGestionnaireApplication implements CommandLineRunner {

    @Autowired
    private GestionnaireRepository gestionnaireRepository;

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceGestionnaireApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Gestionnaire gestionnaire = new Gestionnaire();
        gestionnaire.setNom("Dupont");
        gestionnaire.setPrenom("Pierre");
        gestionnaire.setAdresse("12 Avenue de Lyon");
        gestionnaire.setTel(612345678);
        gestionnaire.setEmail("pierre.dupont@example.com");
        gestionnaire.setPassword("password123");

        gestionnaireRepository.save(gestionnaire);

        System.out.println("Les gestionnaires ont été ajoutés à la base de données.");
    }

}
