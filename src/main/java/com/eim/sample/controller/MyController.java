package com.eim.sample.controller;

import com.eim.sample.model.Customers;
import com.eim.sample.service.ICustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @Autowired
    ICustomerService customerService;

    @RequestMapping("/showCustomers")
    public String findCustomers(Model model) {
        System.out.println("Accessing Method");
        List<Customers> customers = (List<Customers>) customerService.findAll();

        model.addAttribute("customers", customers);

        return "showCustomers";
    }
}
