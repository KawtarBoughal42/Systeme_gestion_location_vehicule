package com.project.systeme__gestion__location__vehicules.microserviceadministrateur.Repository;

import com.project.systeme__gestion__location__vehicules.microserviceadministrateur.Entity.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministrateurRepository extends JpaRepository<Administrateur, Long> {

}
