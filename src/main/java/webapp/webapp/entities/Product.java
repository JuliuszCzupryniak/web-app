package webapp.webapp.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "id_product")
    private int id_product;
    @Column(name = "name_product")
    private String name_product;
    @Column(name = "price_product")
    private float price_product;
    @Column(name = "image_product")
    private byte[] image_product;
    @Column(name = "id_category")
    private int id_category;
}
