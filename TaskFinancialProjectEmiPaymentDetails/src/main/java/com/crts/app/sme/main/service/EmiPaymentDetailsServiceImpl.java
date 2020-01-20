package com.crts.app.sme.main.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.dto.EmiPaymentDetailsDto;
import com.crts.app.sme.main.model.EmiPaymentDetails;
import com.crts.app.sme.main.repository.EmiPaymentDetailsRepository;
import com.crts.app.sme.main.service.EmiPaymentDetailsServiceI;

@Service
public class EmiPaymentDetailsServiceImpl implements EmiPaymentDetailsServiceI{
 @Autowired
 private EmiPaymentDetailsRepository emiPmt;

@Override
public void saveData(EmiPaymentDetails ed) {
	emiPmt.save(ed);
	
}

@Override
public List<EmiPaymentDetails> getData() {
List<EmiPaymentDetails>list=(List<EmiPaymentDetails>) emiPmt.findAll();
	return list;
}

@Override
public void saveEmiPaymentDto(EmiPaymentDetailsDto emiptmdto) {
	  
	ModelMapper m=new ModelMapper();
	   EmiPaymentDetails emidtl=m.map(emiptmdto, EmiPaymentDetails.class);
	   emiPmt.save(emidtl);
	   }

@Override
public List<EmiPaymentDetailsDto> getEmiPaymentDetailsDto() {
	List<EmiPaymentDetails> emilist=(List<EmiPaymentDetails>) emiPmt.findAll();
	List<EmiPaymentDetailsDto> emidtolist=new ArrayList<EmiPaymentDetailsDto>();
	
	ModelMapper m=new ModelMapper();
	for (EmiPaymentDetails emiPaymentDetails : emilist) {
		
		EmiPaymentDetailsDto emmidto=m.map(emiPaymentDetails, EmiPaymentDetailsDto.class);
		emidtolist.add(emmidto);
	}
	   
	return emidtolist;
}
	
}
