package com.assignment.PromotionEngine.service;

import java.util.List;

import com.assignment.PromotionEngine.model.SKUModel;


public interface PromotionEngineService {
	
	public Integer calculateIndividualSKUAmount(String skuCode);
	
	public Integer calculateMultipleSKUAmount(String skuCode, Integer noOfunits );

	public Integer calculatePromotion(List<SKUModel> itemList);

}
