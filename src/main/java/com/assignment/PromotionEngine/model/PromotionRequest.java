package com.assignment.PromotionEngine.model;

import java.util.List;


public class PromotionRequest {
	

	List<SKUModel> itemList;


	public PromotionRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<SKUModel> getItemList() {
		return itemList;
	}

	public void setItemList(List<SKUModel> itemList) {
		this.itemList = itemList;
	}

	public PromotionRequest(List<SKUModel> itemList) {
		super();
		this.itemList = itemList;
	}
	
	

	
}
