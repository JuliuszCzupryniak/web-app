package webapp.webapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webapp.webapp.dtos.PurchaseRequest;
import webapp.webapp.dtos.PurchaseRowRequest;
import webapp.webapp.dtos.PurchaseRowResponse;
import webapp.webapp.entities.PurchaseRow;
import webapp.webapp.entities.PurchaseRowPrimaryKey;
import webapp.webapp.repositories.ProductRepository;
import webapp.webapp.repositories.PurchaseRowRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class PurchaseRowServiceImpl implements PurchaseRowService{
    private final PurchaseRowRepository purchaseRowRepository;
    private final ProductRepository productRepository;

    @Autowired
    public PurchaseRowServiceImpl(PurchaseRowRepository purchaseRowRepository, ProductRepository productRepository) {
        this.purchaseRowRepository = purchaseRowRepository;
        this.productRepository = productRepository;
    }


    @Override
    public List<PurchaseRowResponse> getCustomersPurchaseRows(PurchaseRequest purchaseRequest) {
        return StreamSupport.stream(purchaseRowRepository.findPurchaseRowsByIdPurchase(purchaseRequest.getId_purchase()).spliterator(), false)
                .map(purchaseRow -> new PurchaseRowResponse(purchaseRow.getId_product(),purchaseRow.getId_purchase(),purchaseRow.getQuantity(),purchaseRow.getSum_row()))
                .collect(Collectors.toList());
    }

    @Override
    public void addPurchaseRow(PurchaseRowRequest purchaseRowRequest) {
        PurchaseRow purchaseRow = new PurchaseRow();
        purchaseRow.setId_product(purchaseRowRequest.getId_product());
        purchaseRow.setId_purchase(purchaseRowRequest.getId_purchase());
        purchaseRow.setQuantity(purchaseRowRequest.getQuantity());
        purchaseRow.setSum_row(productRepository.getOne(purchaseRowRequest.getId_product()).getPrice_product() * purchaseRowRequest.getQuantity());
        purchaseRowRepository.save(purchaseRow);
    }

    @Override
    public void deletePurchaseRow(PurchaseRowRequest purchaseRowRequest) {
        int id_purchase = purchaseRowRequest.getId_purchase();
        int id_product = purchaseRowRequest.getId_product();
        purchaseRowRepository.deleteById(new PurchaseRowPrimaryKey(id_product,id_purchase));
    }

    @Override
    public void updatePurchaseRow(PurchaseRowRequest purchaseRowRequest) {
        int id_purchase = purchaseRowRequest.getId_purchase();
        int id_product = purchaseRowRequest.getId_product();
        PurchaseRowPrimaryKey purchaseRowPrimaryKey = new PurchaseRowPrimaryKey(id_product,id_purchase);
        PurchaseRow purchaseRow = purchaseRowRepository.getOne(purchaseRowPrimaryKey);
        purchaseRow.setQuantity(purchaseRowRequest.getQuantity());
        purchaseRow.setSum_row(productRepository.getOne(purchaseRowRequest.getId_product()).getPrice_product() * purchaseRowRequest.getQuantity());
        purchaseRowRepository.save(purchaseRow);
    }
}
