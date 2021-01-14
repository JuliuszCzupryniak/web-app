package webapp.webapp.dtos;

import lombok.Data;


@Data
public class ProductRequest {
    private int id_product;
    private String name_product;
    private float price_product;
    private byte[] image_product;
    private int id_category;
}
