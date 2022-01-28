package core.programs;

public class DataType {

	public static void main(String[] args) {
		
		boolean status=true;
		System.out.println("print " + status);
		
		long data=58585858585L;
		System.out.println("print " + data);
		
		char gender='M';
		System.out.println("print " + gender);
		
		float percent=70.8f;
		System.out.println("Print " + percent);
		
		int i =494;
		long l= i;
		System.out.println("\n print the long value " + l);
		
		int o =(int) l ;
		System.out.println("\n print the int value " + o);
		
		char t=(char) i;
		System.out.println("\n print the char value " + t);
		
		double d=197653733838.003838377636363;
		float r=(float) d;
		System.out.println("\n print the float value " + r);
		System.out.println("\n print the double value " + d);
		
		double d2=1787636378383.0839786756453;
		long l2=(long) d2;
		int i2=(int) d2;
		System.out.println("\n print the double value " + d2);
		System.out.println("\n print the long value " + l2);
		System.out.println("\n print the int value " + i2);
		
		float f=l;
		System.out.println("\n print the float value " + f);
		
		byte b;
		int ii=210;
		double dd=3237.142;
		System.out.println("\n conversion of int to byte.");
		
		b=(byte)ii;
		System.out.println("ii = " + ii+ "b= " +b);
		System.out.println("\n conversion of double to byte.");
		
		b=(byte) dd;
		System.out.println("dd= " + dd + "b= " +b);
		
	}

}
