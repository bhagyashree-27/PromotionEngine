package com.assignment.PromotionEngine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.PromotionEngine.model.SKUModel;
import com.assignment.PromotionEngine.service.SKUService;


@RestController
public class SKUController {
	

@Autowired
SKUService service;

	
	@GetMapping("/skus")
	public List<SKUModel> getSkuDetails() {
		return service.getSkuDetails();
	}
	
	@PostMapping("/skus")
	public SKUModel addSkuDetails() {
		return null;
	}

}
	