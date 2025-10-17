package com.antoninrgb.labintrojpawithspringlocal.service;
import com.antoninrgb.labintrojpawithspringlocal.model.Customer;
import com.antoninrgb.labintrojpawithspringlocal.model.CustomerStatus;
import com.antoninrgb.labintrojpawithspringlocal.repository.CustomerRepo;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {

    CustomerRepo customerRepo;
    public CustomerService(CustomerRepo customerRepo) {this.customerRepo = customerRepo;}

    public List<Customer> findByStatus(CustomerStatus status) {
        return customerRepo.findByStatus(status);
    }

    public List<Customer> findByMilesGreaterThanEqual (int miles) {
        return customerRepo.findByMilesGreaterThanEqual(miles);
    }

}
