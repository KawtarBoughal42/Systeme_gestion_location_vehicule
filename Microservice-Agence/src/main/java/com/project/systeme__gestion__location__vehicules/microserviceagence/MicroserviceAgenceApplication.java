package com.project.systeme__gestion__location__vehicules.microserviceagence;

import com.project.systeme__gestion__location__vehicules.microserviceagence.Entity.Agence;
import com.project.systeme__gestion__location__vehicules.microserviceagence.Repository.AgenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroserviceAgenceApplication implements CommandLineRunner {

    @Autowired
    AgenceRepository agenceRepository;

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceAgenceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Agence agence = new Agence();
        agence.setImage("image1.png");
        agence.setNomEntreprise("Agence Paris");
        agence.setPrenom("Jean");
        agence.setAdresse("10 Rue de Paris");
        agence.setTel(623235950);
        agence.setProprietaire("Jean Dupont");
        agence.setDescription("Agence spécialisée dans la location de voitures de luxe.");
        agence.setWebsite("www.agenceparis.com");
        agence.setCompteFacebook("facebook.com/agenceparis");
        agence.setCompteInstagram("instagram.com/agenceparis");

        agenceRepository.save(agence);

        System.out.println("Les agences ont été ajoutées à la base de données.");
    }
}
