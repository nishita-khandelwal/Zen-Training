package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;


public class ZensarIdolApp 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Performers.xml");
        Performer p = ctx.getBean("Tina",Performer.class);
        p.perform();
        
        System.out.println();
        
        p= ctx.getBean("Meena",Performer.class);
        		p.perform();
        
    
       // ConfigurableApplicationContext cfgCtx = (ConfigurableApplicationContext) ctx;
        //cfgCtx.close();
        
        		  System.out.println();
        	        
        	        p= ctx.getBean("Geeta",Performer.class);
        	        		p.perform();
        	        		
        	        		
        	        		System.out.println();
                	        
                	        p= ctx.getBean("Seema",Performer.class);
                	        		p.perform();
        	        
        
    }
    
}
