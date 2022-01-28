package Assignment;

import java.util.*;

public class linkedListAssign {

	public static void main(String[] args) {
	int a1=5;
	
    LinkedList<String> ll = new LinkedList<String>();
    
    ll.add("April");
    ll.add("May");
    ll.add("June");
    ll.add("July");
    ll.add("August");
    ll.add("November");
  
    ll.addFirst("January");
    ll.addLast( "December");
    
    ll.remove("March");
             
    Iterator itr=ll.iterator();
    while(itr.hasNext()) {
    System.out.println("list is"+ itr.next());
    }
   
    System.out.println(ll);
    System.out.println("Size of the linked list: "+ll.size());
    System.out.println("Is LinkedList empty? "+ll.isEmpty());
    System.out.println("First and Last month of the year" + ll.getFirst() + ll.getLast());
    System.out.println("Birthday Month "+ll.remove());
    System.out.println("Does LinkedList contains 'Winter month'? "+ll.contains("December"));
           
    
    
    
    
}


}

