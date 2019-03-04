package com.concurrentmap;
 
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap; 

class ConcurrentMapEx { 
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ConcurrentHashMap map = new ConcurrentHashMap();
		
		System.out.println("enter name");
		String name=in.next();
		
		System.out.println("enter  phone");
	    long phone=in.nextLong();
	    
	    System.out.println("enter email");
	    String email=in.next();
	    
	    System.out.println("enter address");
	    String address=in.next();
	    
	    System.out.println("enter age");
	    int age=in.nextInt();
		
	    map.put(1, name);
	    map.put(2, email);
	    map.put(3, address);
	    map.put(4,age);
	    map.put(5, phone);
		
	    System.out.println(map);
		
		//m.put(100, "Geeks"); 
		//m.put(101, "For"); 
		//m.put(102, "Geeks"); 
		
		

		// Here we cant add Hello because 101 key 
		// is already present in ConcurrentHashMap object 
		//m.putIfAbsent(101, "Hello"); 

		// We can remove entry because 101 key 
		// is associated with For value 
		//m.remove(101, "For"); 

		// Now we can add Hello 
		//m.putIfAbsent(101, "Hello"); 

		// We can replace Hello with For 
		//m.replace(101, "Hello", "For");  
	} 
} 
