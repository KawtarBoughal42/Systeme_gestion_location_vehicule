package com.project.systeme__gestion__location__vehicules.microservicediscount;

import com.project.systeme__gestion__location__vehicules.microservicediscount.Entity.Discount;
import com.project.systeme__gestion__location__vehicules.microservicediscount.Repository.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class MicroserviceDiscountApplication implements CommandLineRunner {

    @Autowired
    private DiscountRepository discountRepository;

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceDiscountApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Discount discount = new Discount();
        discount.setNom("Réduction de Noël");
        discount.setImage("noel_discount.png");
        discount.setMontantDeReduction(20.0);
        discount.setDateLimite(LocalDate.of(2024, 12, 25));
        discount.setStatut("Actif");

        discountRepository.save(discount);

        System.out.println("Les discounts ont été ajoutés à la base de données.");
    }

}
