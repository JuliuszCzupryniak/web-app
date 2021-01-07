package webapp.webapp.entities;

import javax.persistence.Column;
import java.io.Serializable;

public class PurchaseRowPrimaryKey implements Serializable {
    @Column(name = "id_product")
    private int id_product;
    @Column(name = "id_purchase")
    private int id_purchase;
}
