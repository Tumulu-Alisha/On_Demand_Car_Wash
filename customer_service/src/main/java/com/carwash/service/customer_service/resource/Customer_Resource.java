package com.carwash.service.customer_service.resource;

import com.carwash.service.customer_service.model.Customer;
import com.carwash.service.customer_service.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class Customer_Resource {
	
      @Autowired
      private CustomerRepository customerRepository;
      ConcurrentHashMap<String,Customer> customerDetails=new ConcurrentHashMap<>();
      @PostMapping("/register")
      @ResponseStatus(HttpStatus.CREATED)
      public  void registerCustomer(@RequestBody Customer customer){
            customerRepository.save(customer);
      }
      
      @GetMapping("/profile/{Id}")
      @ResponseStatus(HttpStatus.OK)
      public List<Customer> getCustomerById(@PathVariable("Id") String Id){
            return customerRepository.findAll();
      }
      
      @PutMapping("/update/{Id}")
      @ResponseStatus(HttpStatus.ACCEPTED)
      public Customer updateCustomer(@RequestBody Customer customer,@PathVariable("Id") String Id){
          customer.setId(Id);
          customerRepository.save(customer);
          return customer;
      }
      @DeleteMapping("/delete/{id}")
      public String deleteById(@PathVariable("id") String Id){
             customerRepository.deleteById(Id);
             return "deleted by id: "+ Id;
      }

}