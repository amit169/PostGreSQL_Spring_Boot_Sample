package com.eim.sample.service;

import com.eim.sample.model.Customers;
import com.eim.sample.service.ICustomerService;
import com.eim.sample.repository.CustomersRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private CustomersRepository repository;

    @Override
    public List<Customers> findAll() {

        List<Customers> customers = (List<Customers>) repository.findAll();

        return customers;
    }
}
