package com.assignment.PromotionEngine.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.assignment.PromotionEngine.model.PromotionRequest;
import com.assignment.PromotionEngine.model.SKUModel;
import com.assignment.PromotionEngine.service.PromotionEngineService;


@SpringBootTest
public class PromotionControllerTest {
	@InjectMocks
	PromotionController promotionController;
	@Mock
	PromotionEngineService promotionService;

	@Test
	public void testCalculatePromotion()  {

		SKUModel model  = new SKUModel("A",1);
		List<SKUModel> list = new ArrayList<>();
		list.add(model);
		Mockito.when(promotionService.calculatePromotion(list)).thenReturn(50);
		Integer price = promotionController.calculatePromotion(new PromotionRequest(list));
		Assertions.assertNotNull(price);
	}

}
