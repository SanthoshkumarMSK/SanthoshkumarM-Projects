package Assignment;



class Hello{
	 
	synchronized public void getLine(){
	
		System.out.println("running thread name is:"+Thread.currentThread().getName()); 
		  System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState()); 
		   System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive());
		   System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId());
	
	for(int i=1;i<3;i++)
	{  
		    try{
		    	Thread.sleep(2000);
		    }
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    }  
		    System.out.println(Thread.currentThread().getName()+ "  :"+ i);  
		  }  
	
	
	}
}  

class Abc extends Thread{
	
	Hello line;

	Abc (Hello line)
	{
		this.line = line;
	}

	
	public void run() {
	     
		line.getLine();
	}
}

public class Threads{
	public static void main(String[] args) {
	
		Hello obj =new Hello();
		
		 Abc t1=new Abc(obj);  
	 
		 Abc t2=new Abc(obj);  
		  
		 Abc t3=new Abc(obj); 
		 
			
	        t1.setName("IT");
			t2.setName("Finance");
			t3.setName("Hr");
		   
		  t1.start();
		  
		  t2.start();  
		  t3.start();
		  
	}
	}
	






