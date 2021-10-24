package com.association_asign;

public class Student {

	private int rollNo;
	
	private String name;
	
	private String city;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public void getBranch() {
		Branch branch =new Branch();
		branch.studiesBranch();
	}
	
	public void getSociety() {
		Society society=new Society();
		society.getCollegeSociety();
	}
	
}
