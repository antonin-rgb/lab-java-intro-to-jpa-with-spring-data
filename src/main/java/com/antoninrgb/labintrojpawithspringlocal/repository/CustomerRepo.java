package com.antoninrgb.labintrojpawithspringlocal.repository;
import com.antoninrgb.labintrojpawithspringlocal.model.Customer;
import com.antoninrgb.labintrojpawithspringlocal.model.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

    List<Customer> findByStatus(CustomerStatus status);

    List<Customer> findByMilesGreaterThanEqual(int miles);

}
