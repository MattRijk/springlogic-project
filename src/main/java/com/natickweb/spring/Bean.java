package com.natickweb.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Bean {
	
	private List<ObjectA> list;
	
	private Map<String, String> map;
	
	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	private Set<String> set;
	
	private Properties properties;
	
	public List<ObjectA> getList() {
		return list;
	}
	
	public void setList(List<ObjectA> list){
		this.list = list;
	}
	
	public Map<String, String> getMap() {
		return map;	
	}

	public Set<String> getSet() {
		return set;
	}

	public Properties getProperties() {
		return properties;
	}

	

}
