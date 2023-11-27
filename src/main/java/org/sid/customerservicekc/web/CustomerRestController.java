package org.sid.customerservicekc.web;

import org.sid.customerservicekc.entities.Customer;
import org.sid.customerservicekc.repository.CustomerRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;
@RestController
public class CustomerRestController {
    private CustomerRepository customerRepository;

    public CustomerRestController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    @GetMapping("/customers")
    @PreAuthorize("hasRole('USER')")
    public List<Customer> customerList(){
        return customerRepository.findAll();
    }
    @GetMapping("/customers/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Customer customerById(@PathVariable Long id){
        return customerRepository.findById(id).get();
    }
    @GetMapping("/auth")
    public Principal authentication(Principal principal){
        return principal;
    }
}
