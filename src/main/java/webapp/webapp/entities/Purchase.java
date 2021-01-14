package webapp.webapp.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "purchase")
public class Purchase {
    @Id
    @Column(name = "id_purchase")
    private int id_purchase;
    @Column(name = "id_customer")
    private int id_customer;
    @Column(name = "delivery_city")
    private String delivery_city;
    @Column(name = "delivery_zipcode")
    private int delivery_zipcode;
    @Column(name = "delivery_address")
    private String delivery_address;
    @Column(name = "sum_purchase")
    private float sum_purchase;
    @Column(name = "bought")
    private boolean bought;

    public Purchase() {
    }

    public Purchase(int id_purchase, int id_customer, String delivery_city, int delivery_zipcode, String delivery_address, float sum_purchase, boolean bought) {
        this.id_purchase = id_purchase;
        this.id_customer = id_customer;
        this.delivery_city = delivery_city;
        this.delivery_zipcode = delivery_zipcode;
        this.delivery_address = delivery_address;
        this.sum_purchase = sum_purchase;
        this.bought = bought;
    }

    public int getId_purchase() {
        return id_purchase;
    }

    public void setId_purchase(int id_purchase) {
        this.id_purchase = id_purchase;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public boolean isBought() {
        return bought;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }

    public String getDelivery_city() {
        return delivery_city;
    }

    public void setDelivery_city(String delivery_city) {
        this.delivery_city = delivery_city;
    }

    public int getDelivery_zipcode() {
        return delivery_zipcode;
    }

    public void setDelivery_zipcode(int delivery_zipcode) {
        this.delivery_zipcode = delivery_zipcode;
    }

    public String getDelivery_address() {
        return delivery_address;
    }

    public void setDelivery_address(String delivery_address) {
        this.delivery_address = delivery_address;
    }

    public float getSum_purchase() {
        return sum_purchase;
    }

    public void setSum_purchase(float sum_purchase) {
        this.sum_purchase = sum_purchase;
    }
}
