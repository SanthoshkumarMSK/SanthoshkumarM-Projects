package Assignment;
import java.util.Scanner;

public class Area
{
    public int radius,length, breadth,areaRectangle,area,areaSquare;
    public  float pi=3.14f,half=0.5f;
    public float areaCircle;

    Area()
    {
        radius=0;
        length=0;
        breadth=0;
        area=0;
 
    }
    public void input(int r)
    {
        radius=r;
    }
    public void input(int l,int b)
    {
        length=l;
        breadth=b;
    }

    public void input1(int a)
    {
      area=a;
    }
    void AreaCircle()
    {
        areaCircle=pi*radius*radius;
        System.out.println("Area of the Circle is "+ areaCircle +"cm.square" );
    }

    void AreaSquare()
    {
        System.out.println("Area of the Square is "+ area*area +"cm.square"   );
    }

    void AreaRectangle()
    {
        System.out.println("Area of Rectangle is "+ length*breadth +"cm.square"   );
    }
}
	class Area1
	{
	public int areaTriangle,areaRhombus;
	public float base,height,diagonal1,diagonal2;
	public float half=0.5f;
	
    
	public void input(float b,float h)
    {
        base= b;
        height=h;
    }
    public void input1(float d1,float d2)
    {
    	diagonal1= d1;
    	diagonal2= d2;
    }
	
	void AreaTriangle(int i, int j)
    {
        System.out.println("Area of Triangle is "+ half*base*height +"cm.square"   );
    }
    void AreaRhombus(int i, int j)
    {
        System.out.println("Area of Rhombus is "+ half*diagonal1*diagonal2 +"cm.square");
    }

}
class AreaShapes
{

	private static Scanner sc;

	public static void main(String[] args)
    {
        	sc = new Scanner(System.in);
        	
				System.out.println("Enter the Radius of Circle");
				int r=sc.nextInt();
				System.out.println("Enter the Length and Breadth of Rectangle");
				int len=sc.nextInt();
				int bre=sc.nextInt();
				System.out.println("Enter the Area of Square");
				int a=sc.nextInt();    
   
				Area circle =new Area();
				Area rectangle =new Area();
				Area square =new Area();
				
				
				circle.input(r);
				rectangle.input(len,bre);
				square.input1(a);
   
				circle.AreaCircle();
				rectangle.AreaRectangle();
				square.AreaSquare();
        	
				Area1 triangle=new Area1();
				Area1 rhombus=new Area1();
			
	        	triangle.AreaTriangle(5,6);
	        	rhombus.AreaRhombus(4,3);
	        
			
    }
		
	}



