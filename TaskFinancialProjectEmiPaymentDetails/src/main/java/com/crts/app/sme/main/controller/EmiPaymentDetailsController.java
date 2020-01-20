package com.crts.app.sme.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.sme.main.dto.EmiPaymentDetailsDto;
import com.crts.app.sme.main.model.EmiPaymentDetails;
import com.crts.app.sme.main.service.EmiPaymentDetailsServiceI;

@RestController
public class EmiPaymentDetailsController
{  
	@Autowired
	private EmiPaymentDetailsServiceI emipmtsericei;
	
	@PostMapping("/regemipayment")
	public void savedata(@RequestBody EmiPaymentDetails ed)
	{
		
	   emipmtsericei.saveData(ed);
	   
	}
	@RequestMapping("/getemiptmdata")
	public List<EmiPaymentDetails> getData()
	{
		
	List<EmiPaymentDetails> ed=emipmtsericei.getData();
		return ed;
		
	}
	@RequestMapping("/regemiptmdto")
	public String saveDto(@RequestBody EmiPaymentDetailsDto emiptmdto)
	{
		emipmtsericei.saveEmiPaymentDto(emiptmdto);
		
		return "EmiPaymentDetailsDto save successfully";
		
	}
	@RequestMapping("/getemiPayment")
	public List<EmiPaymentDetailsDto> getEmiPaymentDeatilsDto()
	{
		List<EmiPaymentDetailsDto>list=emipmtsericei.getEmiPaymentDetailsDto();
		return list;
	}

}
