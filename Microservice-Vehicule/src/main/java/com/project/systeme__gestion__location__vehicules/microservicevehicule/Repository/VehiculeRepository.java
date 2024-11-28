package com.project.systeme__gestion__location__vehicules.microservicevehicule.Repository;

import com.project.systeme__gestion__location__vehicules.microservicevehicule.Entity.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {
}
