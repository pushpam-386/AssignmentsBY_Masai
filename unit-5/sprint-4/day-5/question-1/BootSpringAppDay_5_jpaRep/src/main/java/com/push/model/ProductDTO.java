package com.push.model;

public class ProductDTO {
	
	private String productName;
	private Integer quantity;
	private Double price;
	
	public ProductDTO(String productName, Integer quantity, Double price) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	public ProductDTO() {
		super();
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductDTO [productName=" + productName + ", quantity=" + quantity + ", price=" + price + "]";
	}

	
	
}
