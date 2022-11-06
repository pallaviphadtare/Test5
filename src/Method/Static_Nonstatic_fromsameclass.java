package Method;

public class Static_Nonstatic_fromsameclass
{
public static void main(String[] args)
{

	M1();
	Static_Nonstatic_fromsameclass Method=new Static_Nonstatic_fromsameclass();
	Method.M2();
	

}
public static void M1() 
{
System.out.println("static regular method call from same class");	
}
public void M2() 
{
System.out.println("non static regular method call from same class");	
}
}
