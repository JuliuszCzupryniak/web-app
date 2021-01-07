package webapp.webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import webapp.webapp.entities.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Integer> {
}
