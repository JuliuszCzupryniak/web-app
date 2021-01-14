package webapp.webapp.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webapp.webapp.dtos.CustomerRequest;
import webapp.webapp.dtos.PurchaseRequest;
import webapp.webapp.dtos.PurchaseResponse;
import webapp.webapp.entities.Purchase;
import webapp.webapp.repositories.PurchaseRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class PurchaseServiceImpl implements PurchaseService{

    private final PurchaseRepository purchaseRepository;

    @Autowired
    public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }


    @Override
    public List<PurchaseResponse> getCustomersPurchase(CustomerRequest customerRequest) {
        return StreamSupport.stream(purchaseRepository.findAllByIdCustomer(customerRequest.getId_customer()).spliterator(), false)
                .map(purchase -> new PurchaseResponse(purchase.getId_purchase(),purchase.getId_customer(),purchase.getDelivery_city(),purchase.getDelivery_zipcode(),purchase.getDelivery_address(),purchase.getSum_purchase(),purchase.isBought()))
                .collect(Collectors.toList());
    }

    @Override
    public void addPurchase(PurchaseRequest purchaseRequest) {
        Purchase purchase = new Purchase();
        purchase.setId_customer(purchaseRequest.getId_customer());
        purchase.setDelivery_city(purchaseRequest.getDelivery_city());
        purchase.setDelivery_zipcode(purchaseRequest.getDelivery_zipcode());
        purchase.setDelivery_address(purchaseRequest.getDelivery_address());
        purchaseRepository.save(purchase);
    }

    @Override
    public void deletePurchase(PurchaseRequest purchaseRequest) {
        int id_purchase = purchaseRequest.getId_purchase();
        purchaseRepository.deleteById(id_purchase);
    }

    @Override
    public void updatePurchase(PurchaseRequest purchaseRequest) {
        int id_purchase = purchaseRequest.getId_purchase();
        Optional<Purchase> purchase = purchaseRepository.findById(id_purchase);
        purchase.get().setDelivery_address(purchaseRequest.getDelivery_address());
        purchase.get().setDelivery_zipcode(purchaseRequest.getDelivery_zipcode());
        purchase.get().setDelivery_city(purchaseRequest.getDelivery_city());
        purchase.get().setBought(purchaseRequest.isBought());
    }
}
