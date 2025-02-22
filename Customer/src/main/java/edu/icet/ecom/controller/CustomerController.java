package edu.icet.ecom.controller;

import edu.icet.ecom.model.Customer;
import edu.icet.ecom.service.Customer_Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// frontend eken ena network request handel krnw
@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor // finla dla thiyen ewa insialize knrne
@CrossOrigin
public class CustomerController {

    final Customer_Service service;

    @PostMapping("/add")
    public void addCustomer(@RequestBody Customer customer){
        service.addCustomer(customer);
    }

    @GetMapping("getAll")
    public List<Customer> getAll (){
        List<Customer> all = service.getAll();
        return all;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable  Integer id ){
        service.deeleteCutomer(id);
    }

    @PutMapping("update")
    public void updateCustomer(@RequestBody Customer customer){
        service.updateCustxtomer( customer);
    }

    @GetMapping("/search/{id}")
    public Customer searchCustomer(@PathVariable Integer id){
        return service.search (id);
    }

    @GetMapping("/serchByName/{name}")
    public List<Customer>  serchByName(@PathVariable String name){
      return   service.searchByName(name);
    }

    @GetMapping("serchByAddredd/{address}")
    public List<Customer> serchByAddress(@PathVariable String address){
        return service.findByAddress(address);

    }




}
