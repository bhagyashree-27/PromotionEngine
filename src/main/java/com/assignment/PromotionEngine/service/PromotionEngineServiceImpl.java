package com.assignment.PromotionEngine.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.PromotionEngine.dao.Promotion;
import com.assignment.PromotionEngine.dao.PromotionRepository;

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

}
