package webapp.webapp.services;

import webapp.webapp.dtos.PurchaseRequest;
import webapp.webapp.dtos.PurchaseRowRequest;
import webapp.webapp.dtos.PurchaseRowResponse;

import java.util.List;

public interface PurchaseRowService {
    List<PurchaseRowResponse> getCustomersPurchaseRows(PurchaseRequest purchaseRequest);
    void addPurchaseRow(PurchaseRowRequest purchaseRowRequest);
    void deletePurchaseRow(PurchaseRowRequest purchaseRowRequest);
    void updatePurchaseRow(PurchaseRowRequest purchaseRowRequest);
}
