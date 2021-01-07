package webapp.webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import webapp.webapp.entities.PurchaseRow;

@Repository
public interface PurchaseRowRepository extends CrudRepository<PurchaseRow,Integer> {
}
