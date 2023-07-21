package com.ElectricityBillingSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ElectricityBillingSystem.service.CustomerService;
import com.ElectricityBillingSystem.service.ElectricityBillService;
import com.google.protobuf.BlockingService;
import com.ElectricityBillingSystem.entity.Bill;
import com.ElectricityBillingSystem.entity.Customer;

@RestController
@RequestMapping("/electricity-bills")
public class ElectricityBillController {
    @Autowired
    private ElectricityBillService electricityBillService;

    // Implemented API endpoints for electricity usage recording, bill generation, and payment handling

        @GetMapping("/generate-bill/{customerId}")
        public ResponseEntity<Bill> generateBill(@PathVariable Long customerId) {
            // implementation to generate the electricity bill for the customer with the given customerId
            // For example, call electricityBillService.generateBill(customerId);
            // Return the generated bill or an appropriate response
       
        	
        	
        	
        	double unitsConsumed = 100.0; // Example value, replace with actual logic to get units consumed
            int installment = 1; // Example value, replace with actual logic to get installment

        	Bill generatedBill = electricityBillService.generateBill(customerId, unitsConsumed, installment);
            return ResponseEntity.ok(generatedBill);
       }
        
       

         @PostMapping("/pay-bill/{customerId}")
         public ResponseEntity<String> payBill(@PathVariable Long customerId, @RequestBody double amountPaid) {
                // Your implementation to handle the payment for the customer with the given customerId
                // and the amountPaid.
                // For example, call electricityBillService.payBill(customerId, amountPaid);
                // Return a response based on the payment success or failure
             boolean paymentSuccessful = electricityBillService.payBill(customerId, amountPaid);
             if (paymentSuccessful) {
                 return ResponseEntity.ok("Payment successful.");
             } else {
                 return ResponseEntity.badRequest().body("Payment failed.");
             }
         }  
        
        
    }


