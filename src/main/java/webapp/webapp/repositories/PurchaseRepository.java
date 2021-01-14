package webapp.webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import webapp.webapp.entities.Purchase;

import java.util.List;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase,Integer> {
    @Query(nativeQuery = true, value = "SELECT id_purchase,delivery_city,delivery_zipcode,delivery_address,sum_purchase,id_customer,bought FROM purchase " +
            "WHERE purchase.id_customer = :id_customer")
    List<Purchase> findAllByIdCustomer(@Param("id_customer") int id_customer);
}
