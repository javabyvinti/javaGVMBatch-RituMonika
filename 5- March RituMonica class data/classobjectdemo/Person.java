package com.bmpl.classobjectdemo;

public class Person {

	//private -> access within class
	
	private String personName;
	private int personId;
	private long personPhn;
	
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public long getPersonPhn() {
		return personPhn;
	}
	public void setPersonPhn(long personPhn) {
		this.personPhn = personPhn;
	}

	
	
}
