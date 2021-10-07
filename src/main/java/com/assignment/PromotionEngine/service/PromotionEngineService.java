package com.assignment.PromotionEngine.service;

import org.springframework.stereotype.Service;


public interface PromotionEngineService {
	
	public Integer calculateIndividualSKUAmount(String skuCode);
	
	public Integer calculateMultipleSKUAmount(String skuCode, Integer noOfunits );

}
