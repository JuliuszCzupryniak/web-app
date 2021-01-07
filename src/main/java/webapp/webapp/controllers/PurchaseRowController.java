package webapp.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webapp.webapp.entities.PurchaseRow;
import webapp.webapp.repositories.PurchaseRowRepository;

import java.util.List;

@RestController
@RequestMapping("/api/entities/")
public class PurchaseRowController {

    @Autowired
    private PurchaseRowRepository purchaseRowRepository;
    @GetMapping("/purchaseRows")
    public List<PurchaseRow> getAllPurchaseRows(){
        return (List<PurchaseRow>) purchaseRowRepository.findAll();
    }
}
