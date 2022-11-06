package Access_Specifier;

public class Demo1 
{

 int a=20;								// variable initialization & declaration
	
public static void m1() 				        //static regular method
	{
		Demo1  D1=new Demo1();
		System.out.println(D1.a);
	
	}
	
 public Demo1()								      //user defined constructor
	{
		
		
	}
	
	public static void main(String[] args)
	{
		m1();
		Demo1  D1=new Demo1();
		System.out.println(D1.a);
	}
}
