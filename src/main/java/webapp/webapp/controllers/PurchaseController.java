package webapp.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webapp.webapp.entities.Purchase;
import webapp.webapp.repositories.PurchaseRepository;

import java.util.List;

@RestController
@RequestMapping("/api/entities/")
public class PurchaseController {

    @Autowired
    private PurchaseRepository purchaseRepository;
    @GetMapping("/purchases")
    public List<Purchase> getAllPurchases(){
        return (List<Purchase>) purchaseRepository.findAll();
    }
}
