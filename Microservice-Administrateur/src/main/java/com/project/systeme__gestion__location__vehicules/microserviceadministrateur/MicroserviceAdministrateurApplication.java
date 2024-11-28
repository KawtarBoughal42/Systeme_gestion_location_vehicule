package com.project.systeme__gestion__location__vehicules.microserviceadministrateur;

import com.project.systeme__gestion__location__vehicules.microserviceadministrateur.Entity.Administrateur;
import com.project.systeme__gestion__location__vehicules.microserviceadministrateur.Repository.AdministrateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroserviceAdministrateurApplication implements CommandLineRunner {

    @Autowired
    AdministrateurRepository administrateurRepository;

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceAdministrateurApplication.class, args);
    }

    @Override
    public void run(String... args) {

        Administrateur admin = new Administrateur();
        admin.setNom("Dupont");
        admin.setPrenom("Jean");
        admin.setAdresse("10 Rue de Paris");
        admin.setTel(623235950);
        admin.setEmail("jean.dupont@emsi.com");
        admin.setPassword("password123");

        administrateurRepository.save(admin);

        System.out.println("Les administrateurs ont été ajoutés à la base de données.");
    }
}
