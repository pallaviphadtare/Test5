package Constructor;

public class Test1
{
int a=400;       			// Non static global variable
public static void main(String[] args)
{
	Test1 T1=new Test1();  // Test1(){} is known as dafault constructor - used to copy data of class into object when it's created.
	T1.M1();
	T1.M1(400,600);
}
public void M1() 
{
System.out.println(a);	
}
public void M1(int a, int b) 
{
int sum1=a+b;	
System.out.println(sum1);
} 



}

