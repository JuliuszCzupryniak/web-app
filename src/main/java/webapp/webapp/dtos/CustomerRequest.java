package webapp.webapp.dtos;

import lombok.Data;

@Data
public class CustomerRequest {
    private int id_customer;
    private String mail_customer;
    private String name_customer;
    private String surname_customer;
    private String password;
}
