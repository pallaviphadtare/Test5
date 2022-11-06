package Types_of_Variable;

public class Sample2 
{
int Z=100;        // Non static global variable
public static void main(String[] args)
{
	Sample2 Z=new Sample2();
	System.out.println(Z.Z);
	M1();
	Z.M2();
	
}
public static void M1() 
{
	Sample2 A=new Sample2();
	System.out.println(A.Z);
}
public void M2() 
{
System.out.println(Z);	
}
}
