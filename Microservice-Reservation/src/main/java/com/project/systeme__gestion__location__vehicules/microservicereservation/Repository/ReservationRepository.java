package com.project.systeme__gestion__location__vehicules.microservicereservation.Repository;

import com.project.systeme__gestion__location__vehicules.microservicereservation.Entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
