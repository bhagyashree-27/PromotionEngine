package com.assignment.PromotionEngine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.PromotionEngine.dao.Promotion;
import com.assignment.PromotionEngine.dao.PromotionRepository;
import com.assignment.PromotionEngine.model.SKUModel;

@Service
public class PromotionEngineServiceImpl implements PromotionEngineService{

	@Autowired
	PromotionRepository repo;
	
	@Override
	public Integer calculateIndividualSKUAmount(String skuCode) {
		
		Optional<Promotion> opt= repo.findBySkuCode(skuCode);
		
		return opt.get().getPromotionPrice();
	}

	@Override
	public Integer calculateMultipleSKUAmount(String skuCode, Integer noOfunits) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer calculatePromotion(List<SKUModel> itemList) {
		Integer price =0;
	for(SKUModel model : itemList) {
		
		if(model.getNoOfUnits()>1) {
		
			Optional<Promotion> opt= repo.findBySkuCodeAndUnits(model.getSkuCode(), model.getNoOfUnits());
			price = price+ opt.get().getPromotionPrice();
		}else {
			Optional<Promotion> opt= repo.findPerUnitPriceBySkuCode(model.getSkuCode());
			price=price +opt.get().getPromotionPrice();
		}
		
	}
	return price;
	}

}
