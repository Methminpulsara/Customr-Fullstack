package edu.icet.ecom.repository;

import edu.icet.ecom.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Cusromer_Repository extends JpaRepository <CustomerEntity , Integer> {

    List<CustomerEntity> findByName(String name);
    List<CustomerEntity>findByAddress(String name);

}