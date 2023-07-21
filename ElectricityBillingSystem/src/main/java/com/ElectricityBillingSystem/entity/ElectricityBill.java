package com.ElectricityBillingSystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
//import com.example.ElectricityBillingSystem.ElectricityBill;

@Entity
public class ElectricityBill {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Customer customer;
    private double unitsConsumed;
    private double billAmount;
    private boolean isPaid;
    private int installment; //1 month, 2 months, or 3 months installment, respectively
	private boolean paid;
	
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void setUnitsConsumed(double unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }
    public void setInstallment(int installment) {
        this.installment = installment;
    }
    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
	
	public class MainClass {
	    public static void main(String[] args) {
	        ElectricityBill electricityBill = new ElectricityBill();
	        double billAmountValue = 100.0;
	        electricityBill.setBillAmount(billAmountValue); 
	    }
	}
	
	public void setPaid(boolean paid) {
        this.paid = paid;
    }
	

}
