package com.assignment.PromotionEngine.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.assignment.PromotionEngine.dao.Promotion;
import com.assignment.PromotionEngine.dao.PromotionRepository;
import com.assignment.PromotionEngine.model.SKUModel;



@SpringBootTest
public class PromotionEngineServiceTest {
	@InjectMocks
	PromotionEngineService promotionService;
	@Mock
	PromotionRepository promotionRepo;

	@Test
	public void testCalculatePromotion()  {

		SKUModel model  = new SKUModel("A",1);
		List<SKUModel> list = new ArrayList<>();
		list.add(model);
		
		Optional<Promotion> opt1 = Optional.of(new Promotion(1, "A", 3, 50, 130));
	
		Mockito.when(promotionRepo.findBySkuCode(model.getSkuCode())).thenReturn(opt1);
		
		Integer price = promotionService.calculatePromotion(list);
		Assertions.assertEquals(price, 50);
	}
}
