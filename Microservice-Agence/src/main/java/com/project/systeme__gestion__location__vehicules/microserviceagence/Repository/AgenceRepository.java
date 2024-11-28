package com.project.systeme__gestion__location__vehicules.microserviceagence.Repository;

import com.project.systeme__gestion__location__vehicules.microserviceagence.Entity.Agence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgenceRepository extends JpaRepository<Agence, Long> {
}
