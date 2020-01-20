package com.crts.app.sme.main.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crts.app.sme.main.model.EmiDeatilsDto;
import com.crts.app.sme.main.model.EmiDetails;
import com.crts.app.sme.main.service.EmiDetailsServiceI;

@RestController
public class EmiDetailsController
{  
	@Autowired
	private EmiDetailsServiceI hs;
	
	@PostMapping("/log")
	public String savedata(@RequestBody EmiDetails ed)
	{
		
	   hs.saveData(ed);
	   
	return "Save Successlly";
	}
	@GetMapping("/getData")
	public List<EmiDetails> getData()
	{
		
	List<EmiDetails> ed=hs.getData();
		return ed;
		
	}
	
	@RequestMapping("/regdto")
	public String saveEmiDto(@RequestBody EmiDeatilsDto emidto)
	{
		hs.saveEmiDto(emidto);
		
		return "Dto Save successfully";		
		
	}
	@RequestMapping("/getbydto")
	public List<EmiDeatilsDto> getemidto()
	{
	List<EmiDeatilsDto> list=hs.getEmiDto();
		return list;
		
		
	}

}
