package webapp.webapp.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@IdClass(PurchaseRowPrimaryKey.class)
@Table(name  = "purchase_row")
public class PurchaseRow {
    @Id
    @Column(name = "id_product")
    private int id_product;
    @Id
    @Column(name = "id_purchase")
    private int id_purchase;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "sum_row")
    private float sum_row;

    public PurchaseRow() {
    }

    public PurchaseRow(int id_product, int id_purchase, int quantity, float sum_row) {
        this.id_product = id_product;
        this.id_purchase = id_purchase;
        this.quantity = quantity;
        this.sum_row = sum_row;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getSum_row() {
        return sum_row;
    }

    public void setSum_row(float sum_row) {
        this.sum_row = sum_row;
    }
}
