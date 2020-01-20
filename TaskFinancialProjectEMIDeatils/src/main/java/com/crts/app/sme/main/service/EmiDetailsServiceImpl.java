package com.crts.app.sme.main.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crts.app.sme.main.dto.EmiDeatilsDto;
import com.crts.app.sme.main.model.EmiDetails;
import com.crts.app.sme.main.repository.EmiDetailsRepository;
import com.crts.app.sme.main.service.EmiDetailsServiceI;

@Service
public class EmiDetailsServiceImpl implements EmiDetailsServiceI{
 @Autowired
 private EmiDetailsRepository hr;
 
 public void saveData(EmiDetails ed) 
 {
	hr.save(ed);
}
@Override
public List<EmiDetails> getData() {
	List<EmiDetails>ed=(List<EmiDetails>) hr.findAll();
	return ed;
}
@Override
public void saveEmiDto(EmiDeatilsDto emidto) {
	
	ModelMapper m=new ModelMapper();
	   EmiDetails emid=m.map(emidto, EmiDetails.class);
	   hr.save(emid);
	
}
@Override
public List<EmiDeatilsDto> getEmiDto() {
	List<EmiDetails> emilist=(List<EmiDetails>) hr.findAll();
	
	List<EmiDeatilsDto> emidtolist=new ArrayList<>();
	ModelMapper md=new ModelMapper();
	for (EmiDetails emi : emilist) {
		EmiDeatilsDto emd=md.map(emi, EmiDeatilsDto.class);
		emidtolist.add(emd);
		
		
	}
	return emidtolist;
}
	
	
}
