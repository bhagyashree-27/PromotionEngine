package com.assignment.PromotionEngine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.PromotionEngine.model.PromotionRequest;
import com.assignment.PromotionEngine.service.PromotionEngineService;

@RestController
public class PromotionController {
	

@Autowired
PromotionEngineService promotionService;
	
	@GetMapping("/price/{skuCode}")
	public Integer calculateIndividualSKUAmount(@PathVariable("skuCode") String  skuCode) {
		
		return promotionService.calculateIndividualSKUAmount(skuCode);
	}
	
	@PostMapping("/promotion}")
	public Integer calculatePromotion(@RequestBody PromotionRequest request) {
		
		return null;
	}

}
