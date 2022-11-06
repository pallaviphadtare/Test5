package Stirng;

public class return_type 
{

	public static void main(String[] args) 
	{
		return_type A1=new return_type();
		String M=A1.Str("Pallavi","Ghare");
		System.out.println(M);
		
		int Add=addition(30,50);
		System.out.println(Add);
		
		char B=A1.M1();
		System.out.println(B);
	}				
	
	public static int addition(int a, int b)
	{
		int sum=a+b;
		return sum;				
	}
	
	public String Str(String A, String B)
	{
		String Name=A+B;
			return Name;			
	}
	
	public char M1()
	{
		return 'A';
	}
	
	
}
