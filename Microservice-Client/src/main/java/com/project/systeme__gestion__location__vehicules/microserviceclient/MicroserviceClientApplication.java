package com.project.systeme__gestion__location__vehicules.microserviceclient;

import com.project.systeme__gestion__location__vehicules.microserviceclient.Entity.Client;
import com.project.systeme__gestion__location__vehicules.microserviceclient.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroserviceClientApplication implements CommandLineRunner {

    @Autowired
    ClientRepository clientRepository;

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceClientApplication.class, args);
    }

    @Override
    public void run(String... args) {

        Client client = new Client();
        client.setNom("Dupont");
        client.setPrenom("Jean");
        client.setAdresse("123 Rue de Paris");
        client.setTelephone("0102030405");
        client.setEmail("jean.dupont@example.com");
        client.setPassword("password123");
        client.setPhotoProfile("photo1.png");
        client.setStatut("Actif");
        client.setPermisDoc("permis1.pdf");
        client.setID_Licence_Date("2020-01-01");
        client.setID_Licence_Expiry("2030-01-01");
        client.setID_Licence("LIC123456");

        clientRepository.save(client);

        System.out.println("Le client a été ajoutés à la base de données.");
    }
}
