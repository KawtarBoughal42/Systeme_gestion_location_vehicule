package com.project.systeme__gestion__location__vehicules.microservicepaiement.Repository;

import com.project.systeme__gestion__location__vehicules.microservicepaiement.Entity.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementRepository extends JpaRepository<Paiement, Integer> {
}
