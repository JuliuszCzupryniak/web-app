package webapp.webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import webapp.webapp.entities.PurchaseRow;
import webapp.webapp.entities.PurchaseRowPrimaryKey;

import java.util.List;

@Repository
public interface PurchaseRowRepository extends JpaRepository<PurchaseRow, PurchaseRowPrimaryKey> {
    @Query(nativeQuery = true, value = "SELECT ID_PRODUCT, ID_PURCHASE, QUANTITY, SUM_ROW FROM PURCHASE_ROW WHERE ID_PURCHASE = :id_purchase")
    List<PurchaseRow> findPurchaseRowsByIdPurchase(@Param("id_purchase") int id_purchase);
}
