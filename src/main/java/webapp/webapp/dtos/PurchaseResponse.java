package webapp.webapp.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseResponse {
    private int id_purchase;
    private int id_customer;
    private String delivery_city;
    private String delivery_zipcode;
    private String delivery_address;
    private float sum_purchase;
    private boolean bought;
}
