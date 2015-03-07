package com.natickweb.spring;

public class BeanB {
	private String value;
	
	public BeanB(String value2){
		this.value = value2;
	}

	public BeanB() {
		// TODO Auto-generated constructor stub
	}

	public void execute() {
		System.out.println("In Bean B");
		System.out.println(value);
	}

	

}
