package com.assignment.PromotionEngine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.PromotionEngine.dao.Promotion;
import com.assignment.PromotionEngine.dao.PromotionRepository;
import com.assignment.PromotionEngine.model.SKUModel;

@Service
public class PromotionEngineServiceImpl implements PromotionEngineService {

	@Autowired
	PromotionRepository repo;

	@Override
	public Integer calculatePromotion(List<SKUModel> itemList) {
		Integer price = 0;
		for (SKUModel model : itemList) {

			Optional<Promotion> opt = repo.findBySkuCode(model.getSkuCode());
			if (opt.isPresent()) {
				Promotion promotion = opt.get();

				int units = promotion.getUnits();
				int promotionUnits = model.getNoOfUnits() / units;
				int remainingUnits = model.getNoOfUnits() % units;
				price = price + promotionUnits * promotion.getPromotionPrice()
						+ remainingUnits * promotion.getPerUnitPrice();

			}
		}

		return price;

	}
}
