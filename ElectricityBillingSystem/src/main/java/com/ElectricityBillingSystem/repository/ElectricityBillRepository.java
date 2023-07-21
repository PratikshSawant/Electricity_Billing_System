package com.ElectricityBillingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ElectricityBillingSystem.entity.ElectricityBill;

import antlr.collections.List;

public interface ElectricityBillRepository extends JpaRepository<ElectricityBill, Long> {
    List findByInstallment(int installment);
}