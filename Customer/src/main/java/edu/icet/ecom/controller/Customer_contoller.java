package edu.icet.ecom.controller;


import edu.icet.ecom.model.Customer;
import edu.icet.ecom.service.Customer_service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping ("/customer")
@CrossOrigin


public class Customer_contoller {

    final Customer_service service;

    @PostMapping("/add")
    public void addCustomer(@RequestBody Customer customer) {
        service.saveCustomer(customer);
    }

    @GetMapping("/searchCustomer/{id}")
    public  Customer serchCustomer(@PathVariable Integer id){
        return service.serchCustomer(id);
    }

    @PutMapping("/updateCustomer")
    public void updateCustomer(@RequestBody Customer customer){
        service.updateCustomer(customer);
    }

    @DeleteMapping("/deleteCustomer/{id}")
    public void deleteCustomer(@PathVariable Integer id){
        service.deleteCustomer(id);
    }

    @GetMapping("/getAll")
    public List<Customer> getAll (){
        List<Customer> allCustomer = service.getAllCustomer();
        return allCustomer;

    }






}
