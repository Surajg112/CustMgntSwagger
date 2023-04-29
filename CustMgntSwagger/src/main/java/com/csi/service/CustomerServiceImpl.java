package com.csi.service;

import com.csi.dao.CustomerDao;
import com.csi.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao customerDaoImpl;

    @Override
    public void saveData(Customer customer) {
        customerDaoImpl.saveData(customer);
    }

    @Override
    public Customer getDataById(int custId) {
        return customerDaoImpl.getDataById(custId);
    }

    @Override
    public List<Customer> getAllData() {
        return customerDaoImpl.getAllData();
    }

    @Override
    public void updateData(Customer customer) {
        customerDaoImpl.updateData(customer);
    }

    @Override
    public void deleteDataById(int custId) {
        customerDaoImpl.deleteDataById(custId);
    }
}
