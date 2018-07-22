package com.myjavablog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myjavablog.beans.City;


public class BeanScopesMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		
		//Default Singleton scope bean
		City singletonBeanInstance1 = (City) beanFactory.getBean("CitySingletonBean");
		singletonBeanInstance1.setcityName("Pune");
		System.out.println("Singleton Bean value: "+singletonBeanInstance1.getcityName()+"---------- Instance hashcode: "+singletonBeanInstance1.hashCode());
		
		City singletonBeanInstance2 = (City) beanFactory.getBean("CitySingletonBean");
		System.out.println("Singleton Bean value: "+singletonBeanInstance2.getcityName() +"---------- Instance hashcode: "+singletonBeanInstance2.hashCode());
				
		
		//Proptotype scope bean
		City prototypeBeanInstance1 = (City) beanFactory.getBean("CityPrototypeBean");
		prototypeBeanInstance1.setcityName("Pune");
		
		System.out.println("Prototype Bean value: "+prototypeBeanInstance1.getcityName()+"---------- Instance hashcode: "+prototypeBeanInstance1.hashCode());
		
		City prototypeBeanInstance2 = (City) beanFactory.getBean("CityPrototypeBean");
		
		System.out.println("Prototype Bean value: "+prototypeBeanInstance2.getcityName()+"---------- Instance hashcode: "+prototypeBeanInstance2.hashCode());
		
	}
}
