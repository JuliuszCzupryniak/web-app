package webapp.webapp.services;

import webapp.webapp.dtos.CustomerRequest;
import webapp.webapp.dtos.CustomerResponse;

import java.util.List;


public interface CustomerService {
    List<CustomerResponse> getCustomer(CustomerRequest customerRequest);
}
