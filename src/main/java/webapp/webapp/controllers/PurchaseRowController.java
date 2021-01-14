package webapp.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webapp.webapp.dtos.PurchaseRequest;
import webapp.webapp.dtos.PurchaseRowResponse;
import webapp.webapp.entities.PurchaseRow;
import webapp.webapp.services.PurchaseRowService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PurchaseRowController {

    private final PurchaseRowService purchaseRowService;

    @Autowired
    public PurchaseRowController(PurchaseRowService purchaseRowService) {
        this.purchaseRowService = purchaseRowService;
    }

    @GetMapping("/purchase_rows")
    public ResponseEntity<List<PurchaseRowResponse>> getAllPurchaseRows(PurchaseRequest purchaseRequest){
        return new ResponseEntity<>(purchaseRowService.getCustomersPurchaseRows(purchaseRequest), HttpStatus.OK);
    }
}
