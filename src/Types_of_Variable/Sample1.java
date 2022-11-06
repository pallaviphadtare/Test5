package Types_of_Variable;

public class Sample1 
{
static int a=300;    //static global variable
public static void main(String[] args)    //main method
{
m1();
Sample1 Z=new Sample1();   //Creat an object to call static global variable in non static regular method
Z.m2();
	
}
public static void m1()     //static regular method
{

System.out.println(a);
}
public void m2()    //non static regular method
{
	System.out.println(a);
}
}
