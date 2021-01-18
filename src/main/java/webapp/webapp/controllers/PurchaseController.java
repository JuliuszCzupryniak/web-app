package webapp.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import webapp.webapp.dtos.CustomerRequest;
import webapp.webapp.dtos.PurchaseRequest;
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
    public ResponseEntity<List<PurchaseResponse>> getCustomerPurchases(@RequestBody CustomerRequest customerRequest){
        return new ResponseEntity<>(purchaseService.getCustomersPurchase(customerRequest), HttpStatus.OK);
    }

    @PostMapping("/purchases")
    public ResponseEntity addPurchase(@RequestBody PurchaseRequest purchaseRequest){
        purchaseService.addPurchase(purchaseRequest);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PatchMapping("/purchases")
    public ResponseEntity updatePurchase(@RequestBody PurchaseRequest purchaseRequest){
        purchaseService.updatePurchase(purchaseRequest);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/purchases")
    public ResponseEntity deletePurchase(@RequestBody PurchaseRequest purchaseRequest){
        purchaseService.deletePurchase(purchaseRequest);
        return new ResponseEntity(HttpStatus.OK);
    }

}
