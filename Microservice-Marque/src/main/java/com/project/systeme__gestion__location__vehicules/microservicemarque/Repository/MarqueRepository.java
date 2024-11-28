package com.project.systeme__gestion__location__vehicules.microservicemarque.Repository;

import com.project.systeme__gestion__location__vehicules.microservicemarque.Entity.Marque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarqueRepository extends JpaRepository<Marque, Long> {
}
