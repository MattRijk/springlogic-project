package com.natickweb.spring;


public class BeanA {

	private int age;
	private BeanB beanb;


	public BeanB getBeanb() {
		return beanb;
	}
	
	public void setAge(int age) {
		System.out.println("Setting the age value using the setter");
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	public void setBeanb(BeanB beanb) {
		this.beanb = beanb;
	}
	
	
	
	
}
