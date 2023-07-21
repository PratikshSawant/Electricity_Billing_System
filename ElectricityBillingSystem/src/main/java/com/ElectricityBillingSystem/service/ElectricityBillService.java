package com.ElectricityBillingSystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ElectricityBillingSystem.entity.Customer;
import com.ElectricityBillingSystem.entity.ElectricityBill;
import com.ElectricityBillingSystem.repository.ElectricityBillRepository;
import com.google.protobuf.BlockingService;
import com.ElectricityBillingSystem.entity.Bill;
//ElectricityBillService.java
@Service
public class ElectricityBillService {
	
	private BlockingService billservice;
	private Object blockingService;

	public ElectricityBillService(CustomerService customerService, BlockingService billService) {
	    this.customerService = customerService;
		billservice = billService;
	    this.blockingService = blockingService;
	}	

	
 @Autowired
 private ElectricityBillRepository electricityBillRepository;
 @Autowired
 private CustomerService customerService;
 private BlockingService billService;

 // Implement methods for CRUD operations, bill generation, and payment handling
 public Bill generateBill(Customer customer,  double unitsConsumed, int installation, int billingInstallation) {
	 
	ElectricityBill bill = new ElectricityBill();
     bill.setCustomer(customer);
     bill.setUnitsConsumed(unitsConsumed);
     int installment = 1;
	 bill.setInstallment(installment);
     // Calculate bill amount based on tariff and units consumed
     // You can add your billing logic here
	 
     bill.setBillAmount(100);
     electricityBillRepository.save(bill);
	return null;
 }

 
 // Method to handle bill payment
 public void markBillAsPaid(Long billId) {
     Optional<ElectricityBill> optionalBill = electricityBillRepository.findById(billId);
     if (optionalBill.isPresent()) {
         ElectricityBill bill = optionalBill.get();
         bill.setPaid(true);
         electricityBillRepository.save(bill);
     } 
     else {
    	 throw new RuntimeException("Electricity Bill not found with ID: " + billId);
              // Bill not found
     }
}


 public Bill generateBill(Long customerId) {
	
	return null;
}


public Bill generateBill(Long customerId, double unitsConsumed, int installment) {
	
	return null;
}


public boolean payBill(Long customerId, double amountPaid) {

	return false;
}
 
}

