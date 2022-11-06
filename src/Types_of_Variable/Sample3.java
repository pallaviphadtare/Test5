package Types_of_Variable;

public class Sample3
{
	int a=300;    //static global variable
	
	public static void M1() 
	{
		Sample3 Z1=new Sample3();
		System.out.println(Z1.a);
	
	
	}
	public void M2() 
	{
		
		System.out.println(a);
		
		
	}
	
	

	
}
