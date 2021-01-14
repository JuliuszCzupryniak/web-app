package webapp.webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webapp.webapp.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
