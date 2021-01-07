package webapp.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webapp.webapp.entities.Customer;
import webapp.webapp.repositories.CustomerRepository;

import java.util.List;

@RestController
@RequestMapping("/api/entities")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;
    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return (List<Customer>) customerRepository.findAll();
    }

}
