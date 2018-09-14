package com.frank.repository;

import java.util.List;

import com.frank.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}