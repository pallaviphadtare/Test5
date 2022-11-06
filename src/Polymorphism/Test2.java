package Polymorphism;

public class Test2 extends Test1
{
	public void m1(String City)
	{
		System.out.println("Pune");
	}
	public void m1(char Z)
	{
		System.out.println("Vishal");
	}	
	public static void m1(int a, int b, int c) 
	{
		System.out.println("Ghare");
	}
	public void m1() 
	{
	System.out.println("Saswad");	
	}
	void m1(int a) 
	{
		System.out.println("Maharashtra");
	}	
		
	protected void m1(int a, int b) 
	{
		System.out.println("UK");
	}	
	
	public static void main(String[] args)
	{
		Test2 t2=new Test2();
		t2.m1("Pune");
		t2.m1('P');
		t2.m1();
		t2.m1(1);
		t2.m1(1,2);
		m1(1,2,3);
	
	}
	
	
	
}
