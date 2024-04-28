package docker.springbootdocker.service;

import docker.springbootdocker.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    public List<Customer> getAllCustomer(){
        Customer customer1 = new Customer("1","salman","colombo");
        Customer customer2 = new Customer("2","kamal","negambo");
        Customer customer3 = new Customer("3","nimal","jayla");
        Customer customer4 = new Customer("4","sunil","panadura");
      return List.of(customer1, customer2, customer3, customer4);

    }
}
