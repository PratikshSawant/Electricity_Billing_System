package com.ElectricityBillingSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ElectricityBillingSystem.entity.Customer;
import com.ElectricityBillingSystem.repository.CustomerRepository;

@Service
public class CustomerService {
	    
	    private final CustomerRepository customerRepository; 
	
	    @Autowired
	   
	    public List<Customer> getAllCustomers() {

	    	return customerRepository.findAll();
	    }	
	    public CustomerService(CustomerRepository customerRepository) {
	        this.customerRepository = customerRepository;
	    }
	    public Customer createCustomer(Customer customer) {
            // Implementation to create and save the new customer
            return customerRepository.save(customer);
        }
	

	    public Customer getCustomerById(Long customerId) {
	        // Implementation to fetch and return the customer with the given ID
	        return customerRepository.findById(customerId).orElse(null);
	    }     

	    public Customer updateCustomer(Long customerId, Customer updatedCustomer) {
	    	// Implementation to update the existing customer
	    	Customer existingCustomer = customerRepository.findById(customerId).orElse(null);
	    	if (existingCustomer != null) {
	    		// Apply the changes to the existing customer
	    		existingCustomer.setName(updatedCustomer.getName());
	    		existingCustomer.setEmail(updatedCustomer.getEmail());
	    		// ... Update other fields as needed

	    		// Save the updated customer to the database
	    		return customerRepository.save(existingCustomer);
	    	} else {
	    		// Customer with the given ID not found, return null or throw an exception
	    		return null;
	    	}
	    }
	    public boolean deleteCustomer(Long customerId) {
	    	customerRepository.deleteById(customerId);
			return false;
	    }
}

