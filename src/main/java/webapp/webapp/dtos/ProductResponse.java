package webapp.webapp.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    private int id_product;
    private String name_product;
    private float price_product;
    private byte[] image_product;
    private int id_category;
}
