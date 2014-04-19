package com.devlanka.translater.service.impl;

import com.devlanka.translater.configuration.SinglishToSinhalaUnicodeConfiguration;
import com.devlanka.translater.service.WordTranslateService;

public class SinglishToSinhalaUnicodeTranslater extends WordTranslateService {
	
	
	public SinglishToSinhalaUnicodeTranslater() {
		
	}
	
	
	@Override
	public String doTranslate(String englishWord) {
		
		return SinglishToSinhalaUnicodeConfiguration.convertWord(englishWord);
		
	}

}
