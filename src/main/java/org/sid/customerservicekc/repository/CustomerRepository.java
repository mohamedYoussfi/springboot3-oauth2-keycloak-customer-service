package org.sid.customerservicekc.repository;

import org.sid.customerservicekc.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.file.LinkOption;

/**
 * @author mohamedyoussfi
 **/
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
