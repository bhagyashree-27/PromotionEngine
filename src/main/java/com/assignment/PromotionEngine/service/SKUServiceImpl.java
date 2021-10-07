package com.assignment.PromotionEngine.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.assignment.PromotionEngine.model.SKUModel;

@Service
public class SKUServiceImpl implements SKUService{

	@Override
	public List<SKUModel> getSkuDetails() {
		
		return prepareData();
	}

	@Override
	public SKUModel addSkuDetails() {
	
		return null;
	}
	
	public List<SKUModel> prepareData(){
		SKUModel model  = new SKUModel(1,"A",50);
		List<SKUModel> list = new ArrayList<>();
		list.add(model);
		return list;
		
		
	}


}
