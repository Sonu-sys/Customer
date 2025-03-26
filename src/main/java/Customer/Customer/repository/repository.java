package Customer.Customer.repository;
import Customer.Customer.entity.customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<customer, Long> {
}
