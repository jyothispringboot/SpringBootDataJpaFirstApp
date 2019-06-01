package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity

public class Product {
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", prodCode=" + prodCode + ", prodCost=" + prodCost + "]";
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public Double getProdCost() {
		return prodCost;
	}
	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}
	public Product(String prodCode, Double prodCost) {
		super();
		this.prodCode = prodCode;
		this.prodCost = prodCost;
	}
	public Product(Integer productId, String prodCode, Double prodCost) {
		super();
		this.productId = productId;
		this.prodCode = prodCode;
		this.prodCost = prodCost;
	}
	public Product() {
		super();
	}
	@Id
	@GeneratedValue
	private Integer productId;
	private String prodCode;
	private Double prodCost;

}
