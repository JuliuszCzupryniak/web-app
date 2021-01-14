package webapp.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webapp.webapp.dtos.CustomerRequest;
import webapp.webapp.dtos.PurchaseResponse;
import webapp.webapp.services.PurchaseService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PurchaseController {

    private final PurchaseService purchaseService;

    @Autowired
    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @GetMapping("/purchases")
    public ResponseEntity<List<PurchaseResponse>> getCustomerPurchases(CustomerRequest customerRequest){
        return new ResponseEntity<>(purchaseService.getCustomersPurchase(customerRequest), HttpStatus.OK);
    }
}
