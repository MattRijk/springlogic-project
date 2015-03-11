package com.natickweb.spring;


public abstract class Singleton {

	private Prototype prototype;
	

	public abstract Prototype createPrototype();
		

	public void setPrototype(Prototype prototype) {
		this.prototype = prototype;
	}


}
