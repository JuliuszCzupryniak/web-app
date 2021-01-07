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
    @Column(name = "mail_customer")
    private String mail_customer;
    @Column(name = "name_customer")
    private String name_customer;
    @Column(name = "surname_customer")
    private String surname_customer;
    @Column(name = "password")
    private String password;

    public Customer() {
    }

    public Customer(int id_customer, String mail_customer, String name_customer, String surname_customer, String password) {
        this.id_customer = id_customer;
        this.mail_customer = mail_customer;
        this.name_customer = name_customer;
        this.surname_customer = surname_customer;
        this.password = password;
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

    public String getMail_customer() {
        return mail_customer;
    }

    public void setMail_customer(String mail_customer) {
        this.mail_customer = mail_customer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
