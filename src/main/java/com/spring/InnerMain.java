package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Employee;

public class InnerMain {

	public static void main(String[] args) {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("inner-bean.xml");
		Employee bean = ioc.getBean("emp",Employee.class);
		System.out.println(bean);
		

	}

}
