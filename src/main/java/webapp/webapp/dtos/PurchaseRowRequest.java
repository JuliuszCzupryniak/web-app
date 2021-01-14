package webapp.webapp.dtos;

import lombok.Data;

@Data
public class PurchaseRowRequest {
    private int id_product;
    private int id_purchase;
    private int quantity;
    private float sum_row;
}
