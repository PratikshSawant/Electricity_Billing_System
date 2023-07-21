package com.ElectricityBillingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ElectricityBillingSystem.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
} 
