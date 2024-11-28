package com.project.systeme__gestion__location__vehicules.microserviceavisevaluation.Repository;

import com.project.systeme__gestion__location__vehicules.microserviceavisevaluation.Entity.AvisEvaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvisEvaluationRepository extends JpaRepository<AvisEvaluation, Integer> {
}
