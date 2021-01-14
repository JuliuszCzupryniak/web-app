package webapp.webapp.dtos;

import lombok.Data;

@Data
public class PurchaseRequest {
    private int id_purchase;
    private int id_customer;
    private String delivery_city;
    private int delivery_zipcode;
    private String delivery_address;
    private float sum_purchase;
    private boolean bought;


}
