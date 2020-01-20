package com.crts.app.sme.main.dto;

public class EmiPaymentDetailsDto {
	private double emiPaidAmount;

	private double remainingAmount;

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
	
}
