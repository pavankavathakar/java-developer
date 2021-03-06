package com.crts.app.sme.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmiDetails 
  {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int emiPaymentId;

	private String loanNo;

	private double emiAmount;

	private String emiDueDate;

	private double emiPaidAmount;

	private double remainingAmount;

	private double totalAmount;

	private int statusCode;

	public int getEmiPaymentId() {
		return emiPaymentId;
	}

	public void setEmiPaymentId(int emiPaymentId) {
		this.emiPaymentId = emiPaymentId;
	}

	public String getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(String loanNo) {
		this.loanNo = loanNo;
	}

	public double getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}

	public String getEmiDueDate() {
		return emiDueDate;
	}

	public void setEmiDueDate(String emiDueDate) {
		this.emiDueDate = emiDueDate;
	}

	public double getEmiPaidAmount() {
		return emiPaidAmount;
	}

	public void setEmiPaidAmount(double emiPaidAmount) {
		this.emiPaidAmount = emiPaidAmount;
	}

	public double getRemainingAmount() {
		return remainingAmount;
	}

	public void setRemainingAmount(double remainingAmount) {
		this.remainingAmount = remainingAmount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
}
