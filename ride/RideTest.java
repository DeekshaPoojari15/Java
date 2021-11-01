package com.ride;
import java.util.*;


public class RideTest {

	public static void main(String [] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of adults");
		int adult=sc.nextInt();
		System.out.println("Enter the number of children");
		int child=sc.nextInt();
		System.out.println("Enter the number of hours");
		float hours=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter the ride");
		String ride=sc.nextLine();
		RideDetail ad =new RideDetail();
	
		switch(ride.toLowerCase()) {
		case "alibaba":ad.alibaba(hours,adult,child);
			break;
		case "alphine slide":ad.alphineslide(hours,adult,child);
		   break;
		case "bumpper cars":ad.bumppercars(hours,adult,child);
		   break;
		case "baloonrace":ad.balloonrace(hours,adult,child);
		   break;
		default:System.out.println("Invalid ride");
		
		
		}
	}
}
