package webapp.webapp.entities;

import javax.persistence.Column;
import java.io.Serializable;

public class PurchaseRowPrimaryKey implements Serializable {
    @Column(name = "id_product")
    private int id_product;
    @Column(name = "id_purchase")
    private int id_purchase;

    public PurchaseRowPrimaryKey() {
    }

    public PurchaseRowPrimaryKey(int id_product, int id_purchase) {
        this.id_product = id_product;
        this.id_purchase = id_purchase;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getId_purchase() {
        return id_purchase;
    }

    public void setId_purchase(int id_purchase) {
        this.id_purchase = id_purchase;
    }
}
