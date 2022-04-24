package com.JavaCollectionList.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {

	@SerializedName("id")
	@Expose
	private Integer id;
	@SerializedName("productName")
	@Expose
	private String productName;
	@SerializedName("productType")
	@Expose
	private String productType;
	@SerializedName("info")
	@Expose
	private Info info;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}
}


