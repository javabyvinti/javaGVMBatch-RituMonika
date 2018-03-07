package com.bmpl.classobjectdemo;

public class Person {

	//private -> access within class
	
	private String personName;
	private int personId;
	private long personPhn;
	
	
	
	public String getPersonName() {
		return personName;
	}
							//local variable
	public void setPersonName(String personName) {
		// this is a keyword provided by java
		// current class reference
		// 1. when name of local variable and instance variable
		//is same then use this keyword
		
		
		this.personName = personName;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		if(personId>0)
			this.personId = personId;
//		else 
//			return;
		
	}
	public long getPersonPhn() {
		return personPhn;
	}
	public void setPersonPhn(long personPhn) {
		this.personPhn = personPhn;
	}
	
	// setters and getters
	
	// validation
	
}
