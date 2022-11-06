package Stirng;

public class test3
{
public static void main(String[] args)
{
	
	String s1="DECRYPTION";
	String s2="encryption";
	String s3="Software Engineering";
	String s4="";
	String s5="ENCRYPTION";
	String s6="arqtedaretsa";

	System.out.println(s5.substring(4));	// YPTION
	System.out.println(s1.substring(1,4));	// ECR
	System.out.println(s2.charAt(4));		// y
	System.out.println(s6.indexOf('a'));		// 0
	System.out.println(s3.substring(16,20));	// ring
	System.out.println(s2.equalsIgnoreCase(s5));	// true
	System.out.println(s4.isEmpty());		// true
	System.out.println(s5.replace('Y','I'));	// ENCRIPTION
	System.out.println(s5.concat(s1));		// ENCRYPTIONDECRYPTION
	
	
	
	
	
}
}
