package com.JavaCollectionList.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Info {

	@SerializedName("status")
	@Expose
	private String status;
	@SerializedName("stock")
	@Expose
	private Integer stock;
	@SerializedName("price")
	@Expose
	private Double price;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}


