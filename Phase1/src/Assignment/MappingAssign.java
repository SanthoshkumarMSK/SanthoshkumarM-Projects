package Assignment;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class MappingAssign {

	public static void main(String[] args) {

		LinkedHashMap hm=new LinkedHashMap();
		//HashSet<String> hs=new HashSet<String>();
		
		hm.put("1","Apple");
		hm.put("2","Orange");
		hm.put("3","Grape");
		hm.put("4","Banana");
		hm.put("5","Strawberry");
		hm.put("6","Melon");
		hm.put("7","Kiwi");
		hm.put("8","Jack");
		hm.put("9","Pine");
		hm.put("10","Cherry");
		

        System.out.println("linkedhashmap is "+ hm);
        System.out.println("Contents of LinkedHashMap : " + hm);
        hm.remove("4");
        hm.remove("7");
        System.out.println("After removal process, the hashmap is "+hm);
      
        System.out.println(hm.containsValue("Banana"));
        System.out.println(hm.containsValue("Apple"));
        System.out.println(hm.containsValue("4"));

        hm.clear();
        System.out.println("\nContent of LinkedHashMap after clearing: " + hm);
    }
		
	}


