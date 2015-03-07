package com.natickweb.spring;




import java.util.GregorianCalendar;


public class BeanA {


	private GregorianCalendar calendar;
	
	public BeanA(GregorianCalendar calendar){
		this.calendar = calendar;
	}
	
	public int getMonth() {
		return this.calendar.MONTH + 1;
		
	}
	public int getDay() {
		return this.calendar.get(GregorianCalendar.DAY_OF_MONTH);
		
	}
	public int getYear() {
		return this.calendar.get(GregorianCalendar.YEAR);
		
	}
	
	
	
}
