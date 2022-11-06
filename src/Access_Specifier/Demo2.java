package Access_Specifier;

public class Demo2
{
public static void main(String[] args) 
{
	Demo1 D1=new Demo1();
	System.out.println(D1.a);
	Demo1.m1();
	
}
	
	
protected void m1()
{
	System.out.println("hi");
}
protected static void m2()
{
	System.out.println("hello");
}

	
}
