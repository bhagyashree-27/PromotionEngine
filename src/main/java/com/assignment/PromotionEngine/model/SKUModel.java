package com.assignment.PromotionEngine.model;

public class SKUModel {
	
	private Integer skuId;
	
	private String skuCode;
	
	private Integer skuUnitPrice;

	public SKUModel(Integer skuId, String skuCode, Integer skuUnitPrice) {
		super();
		this.skuId = skuId;
		this.skuCode = skuCode;
		this.skuUnitPrice = skuUnitPrice;
	}

	public Integer getSkuId() {
		return skuId;
	}

	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public Integer getSkuUnitPrice() {
		return skuUnitPrice;
	}

	public void setSkuUnitPrice(Integer skuUnitPrice) {
		this.skuUnitPrice = skuUnitPrice;
	}
	
	

}
