package com.project.systeme__gestion__location__vehicules.microservicevehicule;

import com.project.systeme__gestion__location__vehicules.microservicevehicule.Entity.Vehicule;
import com.project.systeme__gestion__location__vehicules.microservicevehicule.Repository.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroserviceVehiculeApplication implements CommandLineRunner {

    @Autowired
    private VehiculeRepository vehiculeRepository;

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceVehiculeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Vehicule vehicule1 = new Vehicule();
        vehicule1.setNomV("Toyota Corolla");
        vehicule1.setImagesV("toyota_corolla.png");
        vehicule1.setItem("Compact");
        vehicule1.setSieges("5");
        vehicule1.setAirbags("6");
        vehicule1.setCouleur("Blanc");
        vehicule1.setAnnee("2021");
        vehicule1.setPrix("70.00");
        vehicule1.setStatus("Disponible");
        vehicule1.setDescription("Une voiture économique et fiable.");
        vehicule1.setTransmission("Automatique");
        vehicule1.setPlaqueImmat("AB-123-CD");
        vehicule1.setTypeCarburant("Essence");
        vehiculeRepository.save(vehicule1);
        System.out.println("Les véhicules ont été ajoutés à la base de données.");
    }
}
