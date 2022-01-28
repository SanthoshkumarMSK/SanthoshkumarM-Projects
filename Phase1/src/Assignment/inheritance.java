package Assignment;

class product{
	int id=70;
	String name="Amul";
	
	public void display(int id,String name) {
		System.out.println(id + name);
	}
}

class A extends product{
	
	int count=50;
	String category="butter";
	 
	public void display (int id ,String name,int count,String category)
	 {
		System.out.println("print all the variables:");
	}
}

class subA extends A{
	int price =30;
	int total;
	
	public void totalprice() {
		total= count*price;
		System.out.println(total +  id + name + category );
		
	}
}

class B extends product{
	
	int count=90;
	String category="Milk";
	 
	public void display (int id ,String name,int count,String category){
		System.out.println("print all the variables:");
	}
}

class subB extends B{
	int price =10;
	int total;
	
	public int totalprice() {
		total= count*price;
		System.out.println(total +  id + name + category );
		return total;
	}
}
class C extends product{
	int count=56;
	String category="choco";
	
	public void display(int Scount,String Scategory) 
	{
		count=Scount;
		category=Scategory;
		System.out.println((id + name + count + category ));
		
	}
}

public class inheritance {

	public static void main(String[] args)
	{
		product p =new product();
		subA a=new subA();
		subB b=new subB();
		C c=new C ();
		
		c.display(56,"choco");
		a.totalprice();
		b.totalprice();
	
		
	
		
	}

}
