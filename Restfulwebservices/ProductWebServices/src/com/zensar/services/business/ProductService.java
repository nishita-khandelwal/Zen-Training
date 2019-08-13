package com.zensar.services.business;

import java.util.List;

import com.zensar.entities.Product;

/*
 * Author: Nishita Khandelwal
 * Creation Date: 26th July 2019 11.20AM
 * Modified Date: 26th July 2019 11.20AM
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved. 
 * Description: Business Object Interface.
 * It focuses on business logic of Product.
 * */

public interface ProductService {
	
	void crate (Product product);
	void edit(Product product);
	void remove(Product product);
	Product findProductById(int ProductId);
	List<Product> findAllProduct();
	int getProductCount();
	List<Product> findProductByBrand(String brand);
    List<Product> findProductByPriceRange(float minPrice,float maxPrice);
	

}
