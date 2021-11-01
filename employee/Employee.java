package com.employee;

public class Employee {

	private int employeeId;
	
	private String employeeName;
	
	private double basicSalary;
	
	private double specialAllowance;
	
	private double hra;
	
	private double travelAllowance;
	
	private double tax=2500;
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getSpecialAllowance() {
		return specialAllowance;
	}

	
	public double getHra() {
		return hra;
	}

	

	public double getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(double travelAllowance) {
		this.travelAllowance = travelAllowance;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double calculateNetSalary() {
		if(basicSalary<=10000) {
			hra=.2*basicSalary;
			specialAllowance=.8*basicSalary;
		}
		else if(basicSalary>10000 && basicSalary<=20000) {
			hra=.25*basicSalary;
			specialAllowance=.9*basicSalary;
		}
		else if(basicSalary<20000) {
			hra=.3*basicSalary;
			specialAllowance=.95*basicSalary;
		}
		return getBasicSalary()+hra+specialAllowance+getTravelAllowance()-getTax();
	}
	
	
}