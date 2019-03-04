package com.searchelement;

import java.util.HashMap;
import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) 
		{ 
			HashMap<Integer, String> hashmap = new HashMap<Integer, String>(); 

			hashmap.put(1, "Prabhusai"); 
			hashmap.put(2, "Koushik"); 
			hashmap.put(3, "Vikram"); 
			hashmap.put(4, "Vijay"); 
			hashmap.put(5, "Deva"); 

 
			System.out.println(" Mappings are: " + hashmap); 
 
			System.out.println("The Value is: " + hashmap.get(2)); 
			
			System.out.println("The Value is: " + hashmap.get(10)); 
		} 
	 

}
