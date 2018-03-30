package com.bmpl.interfacedemo;

public class Emp {

	static int empCount;
	private int empno;
	
	Emp(){
		empCount++;
		//System.out.println(empCount);
	}
		
	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}



	public static void main(String[] args) {
		Emp ram = new Emp();
		ram.setEmpno(1001);
		System.out.println("Ram = " +ram.getEmpno());
		
		Emp shyam = new Emp();
		shyam.setEmpno(1002);
		System.out.println("Shyam = " +shyam.getEmpno());
		
	}

}
