package com.employee;
import java.util.*;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		Employee e=new Employee();
		
		System.out.println("Enter employee details");
		System.out.println("Enter Employee Id");
		e.setEmployeeId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Employee Name");
		e.setEmployeeName(sc.nextLine());
		System.out.println("Enter Basic Salary");
		e.setBasicSalary(sc.nextFloat());
		e.setTravelAllowance(.2*e.getBasicSalary());
		
		System.out.println("Net Salary : "+e.calculateNetSalary());
	}

}
