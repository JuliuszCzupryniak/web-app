package webapp.webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import webapp.webapp.entities.Purchase;

@Repository
public interface PurchaseRepository extends CrudRepository<Purchase,Integer> {
}
