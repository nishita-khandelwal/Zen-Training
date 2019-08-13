package com.zensar.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.SystemPropertyUtils;

import com.zensar.entities.Product;
import com.zensar.services.business.ProductService;

/**
 * Hello world!
 *
 */
public class DbOperations 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("Greetings.xml");
    	Product product = new Product(102,"Dryer","Philips",2000);
    	ProductService service = ctx.getBean("productServiceImpl",ProductService.class);
    	//service.create(product);
    	
    /*	product = service.findProductById(1001);
    	System.out.println(product);
    	
    	Product product1 = new Product(102,"Dryer","Philips",2000);
    	service.edit(product1);*/
    	
    	
    	Product product2 = new Product();
    	product2.setProductId(102);
    	//service.remove(product2);
    	
    	List<Product> productList = service.findAllProducts();
    	for(Product p: productList)
    		System.out.println(p);
    }
}
