package com.project.systeme__gestion__location__vehicules.microservicemarque;

import com.project.systeme__gestion__location__vehicules.microservicemarque.Entity.Marque;
import com.project.systeme__gestion__location__vehicules.microservicemarque.Repository.MarqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroserviceMarqueApplication implements CommandLineRunner {

    @Autowired
    private MarqueRepository marqueRepository;

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceMarqueApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Marque marque = new Marque();
        marque.setNom("Toyota");
        marque.setImage("toyota.png");
        marqueRepository.save(marque);
        System.out.println("Les marques ont été ajoutées à la base de données.");
    }
}
