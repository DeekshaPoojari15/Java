package com.association_asign;
import java.util.*;
public class MainClass {
	
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//Normal student		
		Student s1=new Student();
		s1.setName("Deeksha");
		s1.setRollNo(10);
		s1.setCity("Banglore");
		System.out.println("The student "+s1.getName()+" with ID "+s1.getRollNo()+" from city "+s1.getCity());
		s1.getBranch();
		s1.getSociety();
		
		// UG Student
		UndergradStudent ug1=new UndergradStudent();
		System.out.println("Enter name");
		ug1.setName(sc.nextLine());
		System.out.println("Enter roll number");
		ug1.setRollNo(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter city");
		ug1.setCity(sc.nextLine());
		System.out.println("Enter year");
		ug1.setYear(sc.nextInt());	
		sc.nextLine();
		System.out.println("The  UG student "+ug1.getName()+" with ID "+ug1.getRollNo()+" from city "+ug1.getCity()+" was admitted in "+ug1.getYear());
		ug1.getBranch();
		ug1.getSociety();
		
		
		
	}

}
