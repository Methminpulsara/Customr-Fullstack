package edu.icet.ecom.service;

import edu.icet.ecom.model.Customer;

import java.util.List;

public interface Customer_service {

    void saveCustomer (Customer customer);
    void deleteCustomer(Integer id);
    void updateCustomer (Customer customer);
    List<Customer> getAllCustomer();
    Customer serchCustomer (Integer id);


}
