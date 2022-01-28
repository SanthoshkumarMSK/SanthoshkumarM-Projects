public class method1 {

	 public int calc(int i,int j) {
		 int add=i+j;
		 return add;
	 }
	 public double calc(double r) {
		 double area=2*3.4*r;
		 return area;
	 }
	 public int calc1( int a,int b) {
		 int area1=a*b;
		 return area1;
	 }
		 
	 public static void main(String [] args) {
		 method1 s=new method1();
		 System.out.println("Addition of two numbers : " + s.calc(10,20));
		 System.out.println("Area of Circle: " + s.calc(6.77));
		 System.out.println("Area of Rectangle :" +s.calc1(3,6));
	 }
	 }
	 
	
	  

