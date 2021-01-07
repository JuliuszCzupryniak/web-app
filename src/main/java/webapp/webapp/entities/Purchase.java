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
}
