package edu.icet.ecom.repository;

import edu.icet.ecom.entity.Customer_entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Customer_repository extends JpaRepository <Customer_entity , Integer> {
}
