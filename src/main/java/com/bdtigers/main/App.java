package com.bdtigers.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();
                obj.setName("wasir");
                obj.setPhoneNo("122");
                obj.setEmailId("wasir@gmail.com");
                obj.setAddress("easfjhsdkfhdh");
                obj.printHello();
	}
}
