package com.project.systeme__gestion__location__vehicules.microservicegestionnaire.Repository;

import com.project.systeme__gestion__location__vehicules.microservicegestionnaire.Entity.Gestionnaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GestionnaireRepository extends JpaRepository<Gestionnaire, Integer> {
}
