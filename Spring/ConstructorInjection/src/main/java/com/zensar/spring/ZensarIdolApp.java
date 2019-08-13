package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performance.Performer;

/**
 * Hello world!
 *
 */
public class ZensarIdolApp 
{
    public static void main( String[] args )
    {
        ApplicationContext ct = new ClassPathXmlApplicationContext("Performers.xml");
        Performer p = ct.getBean("Nishita" , Performer.class);
        p.perform();
        
        System.out.println();
        
        Performer p1 = ct.getBean("Reema Mehra",Performer.class);
        
    }
}
