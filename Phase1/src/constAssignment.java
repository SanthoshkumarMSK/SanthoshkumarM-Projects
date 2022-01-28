

public class constAssignment {
	
	int a;
	int b;
	int c;
	float f;
	
    public void calculate(int a,float f) 
    {
    	f=(a*f/2);
         System.out.println("Area of rhombus : "+ f);
    }
	 
    public constAssignment() {
    	System.out.println("Default constructor");
    	
    }
    
    constAssignment (int m){
    	a=m;
    }
    
    constAssignment (int m ,int n){
    	a=m;
    	b=n;
    }
    
    constAssignment (float f2){
    	f=f2;
    }

    public static void main(String args[])
    {
      
      
        
    }
}
	

	

