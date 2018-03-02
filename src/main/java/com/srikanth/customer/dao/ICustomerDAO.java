package com.srikanth.customer.dao;

import java.util.List;

import com.srikanth.customer.domain.Customer;

public interface  ICustomerDAO {
	
	public List<Customer> getAllCustomers() ;
	 
	public Customer getCustomer(int id) ;
 
	public Customer addCustomer(Customer customer);
 
	public void updateCustomer(Customer customer) ;
 
	public void deleteCustomer(int id) ;
	
}
