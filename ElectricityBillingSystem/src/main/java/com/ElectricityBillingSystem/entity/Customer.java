package com.ElectricityBillingSystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String tariffPlan;
	private String email;
	
    public String getName() {
       return name;	  
    }
	public void setName(String name) {
	    this.name = name;
	}    
	    
	// Getter and Setter methods for email attribute
	public String getEmail() {
	     return email;
	}
	
	public void setEmail(String email) {
	     this.email = email;
	}
	
}
	    