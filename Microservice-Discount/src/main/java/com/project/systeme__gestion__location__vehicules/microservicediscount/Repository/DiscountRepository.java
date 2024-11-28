package com.project.systeme__gestion__location__vehicules.microservicediscount.Repository;

import com.project.systeme__gestion__location__vehicules.microservicediscount.Entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepository extends JpaRepository<Discount, Integer> {
}
