package com.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {

	private List<String> person;
	private Map<String,Integer> team;
	private Set<String> domain;
	private Properties prop;

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public Set<String> getDomain() {
		return domain;
	}

	public void setDomain(Set<String> domain) {
		this.domain = domain;
	}

	public Map<String, Integer> getTeam() {
		return team;
	}

	public void setTeam(Map<String, Integer> team) {
		this.team = team;
	}

	public List<String> getPerson() {
		return person;
	}

	public void setPerson(List<String> person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Person [person=" + person + ", team=" + team + ", domain=" + domain + ", prop=" + prop + "]";
	}

	

	
	

	
	
	
}
