package Assignment;

import java.util.regex.Pattern;

public class quantAssign {

	public static void main(String[] args) {
		
	    
		  System.out.println(Pattern.matches("[@,.com]+", " firstname@gmail.com"));
		  System.out.println(Pattern.matches("[@.com]*", " santhosh@gmail.com"));
		  System.out.println(Pattern.matches("[@.com]?", " test123prepere@.edu.com"));
		  System.out.println(Pattern.matches("\\D*", ".com"));
		 System.out.println(Pattern.matches("\\d*", "91"));  
		 
		 System.out.println(Pattern.matches("\\d{10} [+91]$", "+91 1234567891"));
	
	        System.out.println(Pattern.matches("\\d{3}[a-zA-Z]*", "Test123"));
	}

}