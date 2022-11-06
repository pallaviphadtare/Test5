package Stirng;

public class String_Functions 
{
public static void main(String[] args)
{
	
	String S1="velocity";
	String S2="";
	String S3="ABCD";
	String S4="VELOCITY";
	String S5="city";
	String S6="abcabab";
	String S7="classes";
	String S8="Manual Classes";
	String S9="city";

	System.out.println(S1.length());							// 8
	System.out.println(S1.isEmpty());							// false
	System.out.println(S2.isEmpty());							// true
	System.out.println(S1==S4);									// false
	System.out.println(S5==S9);									// true
	System.out.println(S5.equals(S9));							// true
	System.out.println(S1.toUpperCase());						// VELOCITY
	System.out.println(S4.toLowerCase());						// velocity
	System.out.println(S8.replace("Manual","Automation"));		// Automation Classes
	System.out.println(S7.indexOf('s'));						// 3
	System.out.println(S7.lastIndexOf('s'));					// 6
	System.out.println(S1.equalsIgnoreCase(S4));				// true
	System.out.println(S1.contains(S9));						// true
	System.out.println(S5.charAt(3));							// y
	System.out.println(S6.startsWith("abc"));					// true
	System.out.println(S4.endsWith("ty"));						// false	
	System.out.println(S1.substring(3));						// ocity
	System.out.println(S1.substring(0,8));						//	velocity
	System.out.println(S5+S9);									// citycity
	System.out.println(S3.concat(S8));							// ABCDManual Classes
	

	
	
	
	
	
	
	
	
	
}
}
