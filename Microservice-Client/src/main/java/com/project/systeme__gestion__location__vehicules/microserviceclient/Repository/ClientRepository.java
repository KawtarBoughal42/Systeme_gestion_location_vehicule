package com.project.systeme__gestion__location__vehicules.microserviceclient.Repository;

import com.project.systeme__gestion__location__vehicules.microserviceclient.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
