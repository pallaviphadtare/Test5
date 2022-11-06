package Polymorphism;

public class Method_Overloading 
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
public static void main(String[] args)
{

	Method_Overloading M1=new Method_Overloading();
	M1.m1();
	M1.m1(1);
	M1.m1(1,2);
	M1.m1("Pallavi");
	M1.m1('A');
	m1(1,2,3);
}
	
}
