package webapp.webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import webapp.webapp.entities.Category;
import webapp.webapp.entities.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    @Query(nativeQuery = true, value = "SELECT ID_PRODUCT, NAME_PRODUCT, PRICE_PRODUCT, IMAGE_PRODUCT, ID_CATEGORY FROM PRODUCT WHERE ID_CATEGORY = :id_category")
    List<Product> findProductsByIdCategory(@Param("id_category") int id_category);
}
