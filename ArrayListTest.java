package com.arrayListDemo;
import java.util.*;

public class ArrayListTest {
	
	public static void main(String [] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements to be added");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		System.out.println("Sum :"+sum(list));
		System.out.println("Mean :"+mean(list));
		System.out.println("Median :"+median(list));
		sc.close();
		
	}

	private static float median(ArrayList<Integer> list) {
		Collections.sort(list);
		float median=0;
		int size=list.size();
		if(size%2!=0)
			median=list.get(size/2);
		else
			median=(float)(list.get((size/2)-1)+list.get(size/2))/2;
			
		return median;
	}

	private static float mean(ArrayList<Integer> list) {
		int sum=sum(list);
		float mean=(float)sum/list.size();
		return mean;
		
	}

	private static int sum(ArrayList<Integer> list) {
		int sum=0;
		for(int i=0;i<list.size();i++) {
			sum+=list.get(i);
		}
		return sum;
	}

}
