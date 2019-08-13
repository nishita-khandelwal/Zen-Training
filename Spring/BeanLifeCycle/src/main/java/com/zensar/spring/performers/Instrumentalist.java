package com.zensar.spring.performers;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.zensar.spring.instruments.Instrument;

public class Instrumentalist implements Performer,BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean {
	
	private String song;
	private Instrument instrument;
	private String beanName;
	
	
	
	public void setSong(String song ) {
		this.song = song;
		System.out.println("song is set");
	}
	
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("instrument is set");
	}
	
	public void perform() {
		System.out.println("InstrumentaList" + beanName + "is playing" +song);
		instrument.play();

	}
	

	public void setBeanName(String name) {
		
		this.beanName = name;
		System.out.println("Bean name is set");
		
	}

	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		
		System.out.println("Spring core Ioc container bean factory is set");
		
	}

	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		
		System.out.println("Spring Specialized IoC container ApplicationContext is set");
		
	}

	public void afterPropertiesSet() throws Exception {
		
		// instrument.tune();
		System.out.println("afterPropertiesSet is called");
		
	}
	
	public void tuneInstrument() {
		instrument.tune();
		System.out.println("custom init method");
	}

	public void destroy() throws Exception {
		
		instrument.clean();
		System.out.println("destroy method is called");
		
	}


}
