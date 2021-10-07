package com.assignment.PromotionEngine.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Promotion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	
	@Column(name="sku_code ")
	String skuCode;
	
	@Column(name="units")
	Integer units;
	
	@Column(name="promotion_price")
	Integer promotionPrice;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public Integer getUnits() {
		return units;
	}

	public void setUnits(Integer units) {
		this.units = units;
	}

	public Integer getPromotionPrice() {
		return promotionPrice;
	}

	public void setPromotionPrice(Integer promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public Promotion(Integer id, String skuCode, Integer units, Integer promotionPrice) {
		super();
		this.id = id;
		this.skuCode = skuCode;
		this.units = units;
		this.promotionPrice = promotionPrice;
	}

	public Promotion() {
		super();
	}
	
	
	

}
