package docker.springbootdocker.service;

import docker.springbootdocker.model.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getAllCustomer();
}
