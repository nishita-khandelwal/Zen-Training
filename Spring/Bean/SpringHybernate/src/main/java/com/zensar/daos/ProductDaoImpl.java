package com.zensar.daos;

import java.sql.ResultSet;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

/*
 * Author: Nishita Khandelwal

 * Creation Date: 29th July 2019 3.30PM
 * Modified Date: 31th July 2019 10.36AM
 * Version: 2.0
 * Copyright: Zensar Technologies. All rights reserved. 
 * Description: Represents data access object class
 * which implements DAO interface.
 * it contains CRUD operation method for an entity product.
 * 
 * */


import com.zensar.entities.Product;

@Repository

public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void insert(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(product);
		
	}

	public void update(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(product);
		
	}

	public void delete(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(product);
		
	}

	public Product getById(int ProductId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Product.class,ProductId);
	}

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Product.class);
	}
	
	

}
