package com.zensar.services.business;

import java.util.ArrayList;
import java.util.List;

import com.zensar.dao.ProductDao;
import com.zensar.dao.ProductDaoImpl;
import com.zensar.entities.Product;


/*
 * Author: Nishita Khandelwal
 * Creation Date: 26th July 2019 11.32AM
 * Modified Date: 26th July 2019 11.32AM
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved. 
 * Description: Data access Object Interface.
 * It encapsulates business logic of application component product.
 * It interacts with DAO layer to get data from database.
 * It also interact with Presentation layer to give data as per business reqirement.              4
 * */

public class ProductServiceImpl implements ProductService {
	
	private ProductDao dao;
	
	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
		dao = new ProductDaoImpl();
		
	}

	@Override
	public void crate(Product product) {
		// TODO Auto-generated method stub
		dao.insert(product);

	}

	@Override
	public void edit(Product product) {
		// TODO Auto-generated method stub
          Product dbProduct = findProductById(product.getProductId());
          if(dbProduct!=null) {
        	  dbProduct.setName(product.getName());
        	  dbProduct.setBrand(product.getBrand());
        	  dbProduct.setPrice(product.getPrice());
        	  dao.update(dbProduct);
          }else {
        	  System.out.println("Product not found");
          }
	}

	@Override
	public void remove(Product product) {
		// TODO Auto-generated method stub
		Product dbProduct = findProductById(product.getProductId());
		if(dbProduct!=null)
			dao.delete(dbProduct);
		else
			System.out.println("product not found");

	}

	@Override
	public Product findProductById(int ProductId) {
		// TODO Auto-generated method stub
		return dao.getById(ProductId);
	}

	@Override
	public List<Product> findAllProduct() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public int getProductCount() {
		// TODO Auto-generated method stub
		return findAllProduct().size();
	}

	@Override
	public List<Product> findProductByBrand(String brand) {
		// TODO Auto-generated method stub
		List<Product> pList = findAllProduct();
		List<Product> pBList = new ArrayList<>();
		for(Product p:pList) {
			if(p.getBrand().equals(brand))
				pBList.add(p);
		}
		return pBList;
	}

	@Override
	public List<Product> findProductByPriceRange(float minPrice, float maxPrice) {
		// TODO Auto-generated method stub
		List<Product> pList = findAllProduct();
		List<Product> pPList = new ArrayList<>();
		for(Product p:pList) {
			if(minPrice<=(p.getPrice()) && (p.getPrice()<=maxPrice))
				pPList.add(p);
		}
	return pPList;
		
		
		
	}

}
