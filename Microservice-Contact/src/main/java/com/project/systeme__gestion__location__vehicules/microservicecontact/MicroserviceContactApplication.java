package com.project.systeme__gestion__location__vehicules.microservicecontact;

import com.project.systeme__gestion__location__vehicules.microservicecontact.Entity.Contact;
import com.project.systeme__gestion__location__vehicules.microservicecontact.Repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroserviceContactApplication implements CommandLineRunner {
    @Autowired
    private ContactRepository contactRepository;

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceContactApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Contact contact = new Contact();
        contact.setNom("Dupont");
        contact.setPrenom("Jean");
        contact.setEmail("jean.dupont@example.com");
        contact.setMessage("Je souhaite avoir des informations sur vos services.");

        contactRepository.save(contact);

        System.out.println("Les contacts ont été ajoutés à la base de données.");
    }

}
