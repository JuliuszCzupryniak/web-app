package webapp.webapp.services;

import webapp.webapp.dtos.CustomerRequest;
import webapp.webapp.dtos.PurchaseRequest;
import webapp.webapp.dtos.PurchaseResponse;

import java.util.List;

public interface PurchaseService {
    List<PurchaseResponse> getCustomersPurchase(CustomerRequest customerRequest);
    void addPurchase(PurchaseRequest purchaseRequest);
    void deletePurchase(PurchaseRequest purchaseRequest);
    void updatePurchase(PurchaseRequest purchaseRequest);
}
