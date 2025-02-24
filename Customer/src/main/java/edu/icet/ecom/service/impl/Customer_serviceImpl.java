package edu.icet.ecom.service.impl;

import edu.icet.ecom.entity.Customer_entity;
import edu.icet.ecom.model.Customer;
import edu.icet.ecom.repository.Customer_repository;
import edu.icet.ecom.service.Customer_service;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class Customer_serviceImpl implements Customer_service {

    final Customer_repository repository;
    final ModelMapper mapper;


    @Override
    public void saveCustomer(Customer customer) {
        repository.save(mapper.map(customer, Customer_entity.class));

    }

    @Override
    public void deleteCustomer(Integer id) {
        repository.deleteById(id);

    }

    @Override
    public void updateCustomer(Customer customer) {
        repository.save(mapper.map(customer,Customer_entity.class));
    }

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> customerList = new ArrayList<>();
        List<Customer_entity> all = repository.findAll();
        all.forEach(customerEntity -> {
            customerList.add(mapper.map(customerEntity,Customer.class));
        });
        return customerList;
    }

    @Override
    public Customer serchCustomer(Integer id) {
        return mapper.map(repository.findById(id),Customer.class);
    }
}
