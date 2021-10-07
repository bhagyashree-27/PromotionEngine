package com.assignment.PromotionEngine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.PromotionEngine.model.PromotionRequest;
import com.assignment.PromotionEngine.service.PromotionEngineService;

@RestController
public class PromotionController {
	

@Autowired
PromotionEngineService promotionService;

	
	@PostMapping("/promotion")
	public Integer calculatePromotion(@RequestBody PromotionRequest request) {
		
		return promotionService.calculatePromotion(request.getItemList());
	}
	
}
