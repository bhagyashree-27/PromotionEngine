package com.assignment.PromotionEngine.service;

import java.util.List;

import com.assignment.PromotionEngine.model.SKUModel;


public interface PromotionEngineService {
	

	public Integer calculatePromotion(List<SKUModel> itemList);

}
