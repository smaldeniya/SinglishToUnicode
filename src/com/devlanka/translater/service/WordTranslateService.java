package com.devlanka.translater.service;

import com.devlanka.translater.service.impl.SinglishToSinhalaUnicodeTranslater;

public abstract class WordTranslateService {

	private static WordTranslateService translator;
	
	protected WordTranslateService() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Return new instance of {@link WordTranslateService} implementation.
	 * 
	 * @return an instance of type {@link WordTranslateService}.
	 */
	public static WordTranslateService getInstance() {
		
		if(translator == null) {
			translator = new SinglishToSinhalaUnicodeTranslater();
		}
		
		return translator;
	}
	
	
	/**
	 * Translate a singlish word into an sinhala unicode word.
	 * 
	 * @param englishWord a singlish word wanted to be translated to sinhala.
	 * 
	 * @return sinhala unicode sinhala word of the english word.
	 */
	public abstract String doTranslate(String englishWord);
	
}
