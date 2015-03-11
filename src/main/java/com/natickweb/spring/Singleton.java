package com.natickweb.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Singleton implements ApplicationContextAware {

	private Prototype prototype;
	private ApplicationContext context;

	public Prototype createPrototype() {
		return context.getBean("prototype", Prototype.class);
	}

	public void setPrototype(Prototype prototype) {
		this.prototype = prototype;
	}

	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;

	}

}
