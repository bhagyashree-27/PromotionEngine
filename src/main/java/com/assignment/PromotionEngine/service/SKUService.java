package com.assignment.PromotionEngine.service;

import java.util.List;

import com.assignment.PromotionEngine.model.SKUModel;


public interface SKUService {
	
	public List<SKUModel> getSkuDetails();
	
	public SKUModel addSkuDetails();

}
