package webapp.webapp.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "id_customer")
    private int id_customer;
    @Column(name = "name_customer")
    private String name_customer;
    @Column(name = "surname_customer")
    private String surname_customer;
}
