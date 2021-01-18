package webapp.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webapp.webapp.dtos.CustomerRequest;
import webapp.webapp.dtos.CustomerResponse;
import webapp.webapp.services.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customer")
    public ResponseEntity<List<CustomerResponse>> getCustomer(@RequestBody CustomerRequest customerRequest){
        return new ResponseEntity<List<CustomerResponse>>(customerService.getCustomer(customerRequest),HttpStatus.OK);
    }

}
