package com.crts.app.sme.main.service;

import java.util.List;

import com.crts.app.sme.main.dto.EmiPaymentDetailsDto;
import com.crts.app.sme.main.model.EmiPaymentDetails;


public interface EmiPaymentDetailsServiceI {
	public void saveData(EmiPaymentDetails ed);
	public List<EmiPaymentDetails> getData();
	public void saveEmiPaymentDto(EmiPaymentDetailsDto emiptmdto);
	public List<EmiPaymentDetailsDto> getEmiPaymentDetailsDto();
	
}
