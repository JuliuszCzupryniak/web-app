package webapp.webapp.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {
    private int id_customer;
    private String mail_customer;
    private String name_customer;
    private String surname_customer;
}
