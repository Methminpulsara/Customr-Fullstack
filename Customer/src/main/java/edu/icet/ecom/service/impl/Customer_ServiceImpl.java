package edu.icet.ecom.service.impl;

import edu.icet.ecom.entity.CustomerEntity;
import edu.icet.ecom.model.Customer;
import edu.icet.ecom.repository.Cusromer_Repository;
import edu.icet.ecom.service.Customer_Service;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class Customer_ServiceImpl implements Customer_Service {

    final Cusromer_Repository repository;
    final ModelMapper mapper;

    @Override
    public void addCustomer(Customer customer) {
        repository.save(mapper.map(customer, CustomerEntity.class));
    }

    @Override
    public List<Customer> getAll() {
        List <Customer>customerList = new ArrayList<>();
        List<CustomerEntity> all = repository.findAll();
        all.forEach(customer -> {
            customerList.add(mapper.map(customer,Customer.class));
        });
        return customerList;
    }

    @Override
    public void deeleteCutomer(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void updateCustxtomer(Customer customer) {
        repository.save(mapper.map(customer,CustomerEntity.class));
    }

    @Override
    public Customer search(Integer id) {
        return mapper.map(repository.findById(id),Customer.class);
    }

    public List<Customer> searchByName (String name){
        List<CustomerEntity> byName = repository.findByName(name);
        List<Customer> customerList = new ArrayList<>();
        byName.forEach(customerEntity -> {
            customerList.add(mapper.map(customerEntity,Customer.class));
        });
        return customerList;
    }

    @Override
    public List<Customer> findByAddress(String address) {
        List<CustomerEntity> byAddress = repository.findByAddress(address);
        List<Customer>customerList = new ArrayList<>();
        byAddress.forEach(customerEntity -> {
            customerList.add(mapper.map(customerEntity,Customer.class));
        });
        return customerList;
    }


}
