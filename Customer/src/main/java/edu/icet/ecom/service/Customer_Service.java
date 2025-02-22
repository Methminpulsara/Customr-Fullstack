package edu.icet.ecom.service;

import edu.icet.ecom.model.Customer;

import java.util.List;

public interface Customer_Service {
    public void addCustomer(Customer customer);
    List <Customer> getAll();
    public void deeleteCutomer(Integer id);
    void updateCustxtomer(Customer customer);
    Customer search(Integer id);
    List<Customer> searchByName(String name);

    List<Customer> findByAddress(String address);
}
