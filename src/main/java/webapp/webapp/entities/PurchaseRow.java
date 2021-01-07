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
}
