package com.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.model.Customer;

public interface CustomerDao extends CrudRepository<Customer, Integer>{

}
