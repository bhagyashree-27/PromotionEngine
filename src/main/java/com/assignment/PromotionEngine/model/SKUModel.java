package com.assignment.PromotionEngine.model;

public class SKUModel {
	
	
	private String skuCode;
	
	private Integer noOfUnits;

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public Integer getNoOfUnits() {
		return noOfUnits;
	}

	public void setNoOfUnits(Integer noOfUnits) {
		this.noOfUnits = noOfUnits;
	}

	public SKUModel(String skuCode, Integer noOfUnits) {
		super();
		this.skuCode = skuCode;
		this.noOfUnits = noOfUnits;
	}

	
	

}
