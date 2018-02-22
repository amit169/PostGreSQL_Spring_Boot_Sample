package com.eim.sample.service;


import com.eim.sample.model.Customers;
import java.util.List;

public interface ICustomerService {

    public List<Customers> findAll();
}
