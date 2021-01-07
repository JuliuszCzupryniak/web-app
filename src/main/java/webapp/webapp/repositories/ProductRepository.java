package webapp.webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import webapp.webapp.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {
}