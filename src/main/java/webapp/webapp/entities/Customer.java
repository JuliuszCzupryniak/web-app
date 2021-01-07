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

    public Customer() {
    }

    public Customer(int id_customer, String name_customer, String surname_customer) {
        this.id_customer = id_customer;
        this.name_customer = name_customer;
        this.surname_customer = surname_customer;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public String getName_customer() {
        return name_customer;
    }

    public void setName_customer(String name_customer) {
        this.name_customer = name_customer;
    }

    public String getSurname_customer() {
        return surname_customer;
    }

    public void setSurname_customer(String surname_customer) {
        this.surname_customer = surname_customer;
    }
}
