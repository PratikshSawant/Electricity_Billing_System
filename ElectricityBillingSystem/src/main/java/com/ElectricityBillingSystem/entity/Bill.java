package com.ElectricityBillingSystem.entity;

import java.time.LocalDate;

public class Bill {
    private Long id;
    private Long customerId;
    private double amount;
    private LocalDate billingDate;
    private LocalDate dueDate;
    // Other attributes

    // Constructors
    public Bill() {
        //Default constructor
    }

    // Parameterized constructor
    public Bill(Long id, Long customerId, double amount, LocalDate billingDate, LocalDate dueDate) {
        this.id = id;
        this.customerId = customerId;
        this.amount = amount;
        this.billingDate = billingDate;
        this.dueDate = dueDate;
        // Initialize other attributes if needed
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(LocalDate billingDate) {
        this.billingDate = billingDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    // Other methods, if needed
}

