package com.zensar.entities;
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.springframework.stereotype.Component;
 
 
 
/*
 * Author: Nishita Khandelwal
 * Creation Date: 29th July 2019 5.55PM
 * Modified Date: 31th July 2019 10.52AM
 * Version: 2.0
 * Copyright: Zensar Technologies. Alll rights reserved. 
 * Description: Represents business entity product.
 * value object of application,
 * domain or application object.
 * It is also POJO. 
 * It is a persistent class of hibernate.
 * */

@Component
@Entity
@Table(name="product")


public class Product 
{
	@Id
	@Column(name="id")
	
	private int productId;
	private String name;
	private String brand;
	private double price;
 
	public Product()
	{
 
	}
 
	public Product(int productId, String name, String brand, double price) 
	{
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
 
	public int getProductId() {
		return productId;
	}
 
	public void setProductId(int productId) {
		this.productId = productId;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public String getBrand() {
		return brand;
	}
 
	public void setBrand(String brand) {
		this.brand = brand;
	}
 
	public double getPrice() {
		return price;
	}
 
	public void setPrice(double price) {
		this.price = price;
	}
 
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
 
 
 
}