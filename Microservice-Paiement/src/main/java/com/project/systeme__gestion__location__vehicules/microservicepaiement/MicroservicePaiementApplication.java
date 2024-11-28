package com.project.systeme__gestion__location__vehicules.microservicepaiement;

import com.project.systeme__gestion__location__vehicules.microservicepaiement.Entity.Paiement;
import com.project.systeme__gestion__location__vehicules.microservicepaiement.Repository.PaiementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroservicePaiementApplication implements CommandLineRunner {

    @Autowired
    private PaiementRepository paiementRepository;

    public static void main(String[] args) {
        SpringApplication.run(MicroservicePaiementApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Paiement paiement = new Paiement();
        paiement.setStatut("Validé");
        paiement.setReservationID(101);
        paiement.setMontant("200.00");
        paiementRepository.save(paiement);
        System.out.println("Les paiements ont été ajoutés à la base de données.");
    }

}
