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

    public Product() {
    }

    public Product(int id_product, String name_product, float price_product, byte[] image_product, int id_category) {
        this.id_product = id_product;
        this.name_product = name_product;
        this.price_product = price_product;
        this.image_product = image_product;
        this.id_category = id_category;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public float getPrice_product() {
        return price_product;
    }

    public void setPrice_product(float price_product) {
        this.price_product = price_product;
    }

    public byte[] getImage_product() {
        return image_product;
    }

    public void setImage_product(byte[] image_product) {
        this.image_product = image_product;
    }

    public int getId_category() {
        return id_category;
    }

    public void setId_category(int id_category) {
        this.id_category = id_category;
    }
}
