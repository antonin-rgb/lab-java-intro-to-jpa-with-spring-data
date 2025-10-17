package com.antoninrgb.labintrojpawithspringlocal.controller;
import com.antoninrgb.labintrojpawithspringlocal.model.Customer;
import com.antoninrgb.labintrojpawithspringlocal.model.CustomerStatus;
import com.antoninrgb.labintrojpawithspringlocal.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    CustomerService customerService;
    public CustomerController(CustomerService customerService) {this.customerService = customerService;}

    @GetMapping("/status/{status}")
    public List<Customer> getByStatus(@PathVariable CustomerStatus status) {
        return customerService.findByStatus(status);
    }

    @GetMapping("/miles")
    public List<Customer> getByMileageGreater() {
        return customerService.findByMilesGreaterThanEqual(100000);
    }

}
