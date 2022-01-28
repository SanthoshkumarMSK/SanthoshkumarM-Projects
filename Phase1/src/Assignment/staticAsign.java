package Assignment;

import java.util.Stack;

public class staticAsign {

	public static void main(String[] args) {
	
		  Stack<String> stack1 = new Stack<String>(); // Initialization of Stack using Generics 
	         Stack stack2 = new Stack(); 
	        
	   
	         stack1.push("Apple"); 
	         stack1.push("Banana"); 
	         stack1.push("kiwi"); 
	         stack1.push("guva"); 
	         stack1.push("orange"); 
	         stack1.push("tamilnadu"); 
	         stack1.push("chennai"); 
	         stack1.push("delhi"); 
	         stack1.push("pune"); 
	         stack2.push(4); 
	         stack2.push(3); 
	         stack2.push(2); 
	         stack2.push(1);
	         stack1.push("a"); 
	         stack1.push("b"); 
	         
	         System.out.println("index of elemtn All inside the stack"+ stack1.indexOf("All"));
	         
	         
	     
	         System.out.println("Popped element from stack 1: " + stack1.pop()); 
	         System.out.println("Popped element from stack 1: " + stack1.pop());  
	         System.out.println("Popped element from stack 1: " + stack1.pop()); 
	         System.out.println("Popped element from stack 2: " + stack2.pop());  
	         System.out.println("Popped element from stack 2: " + stack2.pop()); 
	         
	   
	         System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek()); 
	         
	         System.out.println("Popped element from stack 1: " + stack1.pop()); 
	         
	         System.out.println("Popped element from stack 1: " + stack1.pop()); 
	         System.out.println("Popped element from stack 1: " + stack1.pop()); 
	         System.out.println("Popped element from stack 1: " + stack1.pop()); 
	         
	         System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek()); 
	         

	         System.out.println("index of elemtn All inside the stack"+ stack1.indexOf("Apple"));
	         System.out.println("index of elemtn All inside the stack"+ stack1.indexOf("delhi"));
	         
	    
	         System.out.println("The element at the top of the"+ " stack-2 is: " + stack2.peek()); 

	 
	         System.out.println(stack1); 
	         System.out.println(stack2); 
	         
	    } 
	  }
	
