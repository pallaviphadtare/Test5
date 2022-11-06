package Stirng;

public class String_Methods
{
public static void main(String[] args)
{
	String S1="Pallavi";
	String S2="Vishal";
	String S3="vishal";
	String S4="";
	String S9="vishal";
	
	String S5=new String("Apple");
	String S6=new String("banana");
	String S7=new String("MANGO");
	String S8=new String("pune");
	String S10=new String("pune");
	String S11=new String("Pune, Maharashtra");
	
	//to get size/length
	System.out.println(S5.length());				// 5
	
	//convert into lower case						
	System.out.println(S5.toLowerCase());			//apple
	
	//covert to upper case
	System.out.println(S6.toUpperCase());			// BANANA
	
	//compare S2 & S3 AND S7 & S8
	System.out.println(S2.equals(S3));				// False
	System.out.println(S7.equals(S8));				// false
	
	//compare S2 & S6
	System.out.println(S2.equals(S6));				// false
	
	//to check empty or not
	System.out.println(S4.isEmpty());				// true
	System.out.println(S5.isEmpty());				// false
	
	//compare S2 & S3
	System.out.println(S2.equalsIgnoreCase(S3));	// true
	System.out.println(S2==S3);    					// false
	
	//compare S3 & S9
	System.out.println(S3==S9);    					// true
	
	//compare S6 & S7
	System.out.println(S6==S7);   					// false
	
	//compare S8 & S10
	System.out.println(S8==S10);  					// false
	
	//compare S1 & S5
	System.out.println(S1==S5);						// false
	
	//compare S8 & S10
	System.out.println(S8.contains(S10)); 			// true
	
	//to get single character
	System.out.println(S2.charAt(1));				// i
	
	//to verify String S6 starts with "ba"
	System.out.println(S6.startsWith("ba"));		// true
	
	//to verify String S6 ends with "na"
	System.out.println(S6.endsWith("ba"));			// false
	
	//to get index of character
	System.out.println(S5.indexOf('l'));			// 3
	
	//to get last index of character
	System.out.println(S6.lastIndexOf('a'));		// 5
	
	//to get substring
	System.out.println(S9.substring(3));			// hal
	System.out.println(S3.substring(2,6));	  		// shal
	
	//to concat S2 & S8
	System.out.println(S2+S8);						// Vishalpune
	System.out.println(S2.concat(S8));				// Vishalpune
	
	//to replace
	System.out.println(S11.replace("Pune","Mumbai"));	// Mumbai, Maharashtra
	
	
}
}
