package com.natickweb.spring;


public class BeanA {

	private String prop1;
	private BeanB beanB;

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}
	
	public BeanB getBeanB() {
		return beanB;
	}
	
	public void setProp1(String prop1) {
		this.prop1 = prop1;
	}
	
	public String getProp1() {
		return prop1;
	}

	
	
	
	
	
}
