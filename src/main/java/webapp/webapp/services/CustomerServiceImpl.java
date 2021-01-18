package webapp.webapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webapp.webapp.dtos.CategoryResponse;
import webapp.webapp.dtos.CustomerRequest;
import webapp.webapp.dtos.CustomerResponse;
import webapp.webapp.repositories.CustomerRepository;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerResponse> getCustomer(CustomerRequest customerRequest) {
        Integer integer = new Integer(customerRequest.getId_customer());
        List <Integer> list = new LinkedList<>();
        list.add(integer);
        return StreamSupport.stream(customerRepository.findAllById(list).spliterator(), false)
                .map(customer -> new CustomerResponse(customer.getId_customer(),customer.getMail_customer(),customer.getName_customer(),customer.getSurname_customer()))
                .collect(Collectors.toList());
    }
}
