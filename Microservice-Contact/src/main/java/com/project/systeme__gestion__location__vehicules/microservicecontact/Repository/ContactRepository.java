package com.project.systeme__gestion__location__vehicules.microservicecontact.Repository;

import com.project.systeme__gestion__location__vehicules.microservicecontact.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
