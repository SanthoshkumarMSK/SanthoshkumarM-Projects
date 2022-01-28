package Assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class HashExample{
	public static void main(String[] args){
		
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		//HashSet<String> hs=new HashSet<String>();
		
		hs.add("Apple");
		hs.add("Orange");
		hs.add("Grape");
		hs.add("Banana");
		hs.add("Strawberry");
		hs.add("Melon");
		hs.add("Kiwi");
		hs.add("Jack");
		hs.add("Pine");
		hs.add("Cherry");
				
		System.out.println("Hashset is "+hs);
		System.out.println("Size of Hashset is "+ hs.size());
		System.out.println("Add the element" + hs.add("Fruit1,Fruit2,Fruit3"));
		System.out.println("Does hashset contains this 'Orange' Fruit  " + hs.contains("Orange"));		
		System.out.println("is hashset empty  " + hs.isEmpty());
		System.out.println("remove the element " +hs.remove("Pine,Cherry,Jack"));
		
		
	    
	    
		
	}
}
