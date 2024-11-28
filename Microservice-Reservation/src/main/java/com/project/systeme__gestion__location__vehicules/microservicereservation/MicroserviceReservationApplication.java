package com.project.systeme__gestion__location__vehicules.microservicereservation;

import com.project.systeme__gestion__location__vehicules.microservicereservation.Entity.Reservation;
import com.project.systeme__gestion__location__vehicules.microservicereservation.Repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class MicroserviceReservationApplication implements CommandLineRunner {

    @Autowired
    private ReservationRepository reservationRepository;

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceReservationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Reservation reservation = new Reservation();
        reservation.setDateDebut(LocalDate.now());
        reservation.setDateFin(LocalDate.now().plusDays(5));
        reservation.setPrix(200);
        reservation.setEtat("Confirmée");
        reservation.setFraitDeRetard("0.0");
        reservationRepository.save(reservation);
        System.out.println("La réservation et son client ont été ajoutés à la base de données.");
    }

}
