package Types_of_Variable;

public class Local 
{
	public static void main(String[] args)
	{
		
	}
	public static void m1(int c)      //local variable = "create variable inside the method n scope is within that method only"
	{
		int a=10;                     //local variable  = "temporary"
		System.out.println(a);
		int b=20;                       //local variable
		System.out.println(b);
	}
	public static void m2() 
	{
		
	}
	public void m3() 
	{
		int a=10;                        //local variable
		System.out.println(a);
	}
}
