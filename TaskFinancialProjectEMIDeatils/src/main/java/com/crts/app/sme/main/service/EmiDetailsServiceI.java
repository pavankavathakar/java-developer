package com.crts.app.sme.main.service;

import java.util.List;

import com.crts.app.sme.main.model.EmiDeatilsDto;
import com.crts.app.sme.main.model.EmiDetails;


public interface EmiDetailsServiceI {
	public void saveData(EmiDetails ed);
	public List<EmiDetails> getData();
	public void saveEmiDto(EmiDeatilsDto emidto);
	public List<EmiDeatilsDto> getEmiDto();
}
