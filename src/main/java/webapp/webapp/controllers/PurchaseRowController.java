package webapp.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import webapp.webapp.dtos.PurchaseRequest;
import webapp.webapp.dtos.PurchaseRowRequest;
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
    public ResponseEntity<List<PurchaseRowResponse>> getAllPurchaseRows(@RequestBody PurchaseRequest purchaseRequest){
        return new ResponseEntity<>(purchaseRowService.getCustomersPurchaseRows(purchaseRequest), HttpStatus.OK);
    }

    @PostMapping("/purchase_rows")
    public ResponseEntity addPurchaseRow(@RequestBody PurchaseRowRequest purchaseRowRequest){
        purchaseRowService.addPurchaseRow(purchaseRowRequest);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PatchMapping("/purchase_rows")
    public ResponseEntity updatePurchaseRow(@RequestBody PurchaseRowRequest purchaseRowRequest){
        purchaseRowService.updatePurchaseRow(purchaseRowRequest);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/purchase_rows")
    public ResponseEntity deletePurchaseRow(@RequestBody PurchaseRowRequest purchaseRowRequest){
        purchaseRowService.deletePurchaseRow(purchaseRowRequest);
        return new ResponseEntity(HttpStatus.OK);
    }
}
