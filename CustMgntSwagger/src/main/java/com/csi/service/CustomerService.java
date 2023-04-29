package com.csi.service;

import com.csi.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    public void saveData(Customer customer);

    public Customer getDataById(int custId);

    public List<Customer> getAllData();

    public void updateData(Customer customer);

    public void deleteDataById(int custId);

}
