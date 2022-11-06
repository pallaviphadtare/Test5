package Polymorphism;

public class Test1
{
	public void m1() 
	{
	System.out.println("Hi");	
	}
	void m1(int a) 
	{
		System.out.println("Pallavi");
	}	
		
	protected void m1(int a, int b) 
	{
		System.out.println("Hello");
	}	
		
	public static void main(String[] args)
	{
		Test1 T1=new Test1();
		T1.m1();
		T1.m1(1);
		T1.m1(1,2);


		
		
	}
	
	
	
	
	
	
	
	
	
	
}
