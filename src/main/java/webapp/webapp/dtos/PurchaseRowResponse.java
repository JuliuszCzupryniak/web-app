package webapp.webapp.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseRowResponse {
    private int id_product;
    private int id_purchase;
    private int quantity;
    private float sum_row;
}
