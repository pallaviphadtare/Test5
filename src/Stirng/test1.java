package Stirng;

public class test1
{
 
	public static void main(String[] args) 
	{
		// Using new keyword
		String S1=new String("Pallavi");
		String S5=new String("Banana");
		String S3=new String("Blue");
		String S4=new String("PALLAVI");
		
		// Without using new keyword
		String S2="PALLAVI";
		String S6="BANANA";
		String S7="BANANA";
		String S8="Pallavi";
		
		// Usage
		System.out.println(S1==S5);		
		System.out.println(S1==S4);		
		System.out.println(S1==S3);
		System.out.println(S5==S4);		
		System.out.println(S1==S4);		
		System.out.println(S2==S6);		
		System.out.println(S2==S7);	
		System.out.println(S2==S8);		
		System.out.println(S6==S7);  
		
		System.out.println(S1.equals(S4));
		System.out.println(S1.equals(S3));
		System.out.println(S7.equals(S6));
		System.out.println(S2.equals(S8));
		
		
	}	
	
	
	
}
