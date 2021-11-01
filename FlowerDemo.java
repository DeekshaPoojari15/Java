package com.flower;
import java.util.*;

public class FlowerDemo {
	HashMap<String, HashMap<String, String>> continent=new HashMap<>();
	HashMap<String, String> map1=new HashMap<>();
	HashMap<String, String> map2=new HashMap<>();
	HashMap<String, String> map3=new HashMap<>();
	
	FlowerDemo(){
		
		map1.put("India","Lotus");
		map1.put("Paksitan","Jasmine");
		map1.put("Nepal","Lali Gurans");
				
		map2.put("Germany","Corn Flower");
		map2.put("France","Lily");
		map2.put("Greece","Acanthus Mollis");
				
		map3.put("Egypt","Blue Lotus");
		map3.put("Nigeria","Yellow Trumpet");
		map3.put("Kenya","Orchid");
				
		continent.put("asia", map1);
		continent.put("europe", map2);
		continent.put("africa", map3);
	}
	
void displayFlower(String input) {
		
		HashMap<String,String> m=continent.get(input.toLowerCase());
		System.out.println("Country \tFlower");
		System.out.println("------------------------------");
		for(String s:m.keySet()) {
			System.out.println(s+"\t\t"+m.get(s));
		}
		
	}

	public static void main(String[] args) {
		
		FlowerDemo flower=new FlowerDemo();
		System.out.println("Enter continent name");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		flower.displayFlower(input);
		
	}

	

}
