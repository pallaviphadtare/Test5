package Control_Statements;

public class Nested_if_2 
{
public static void main(String[] args) 
{
String women="wing A";
String men="wing B";
if("wing A"==women) 
{
System.out.println("vaccination done");
	if("wing B1"==men) 
	{
		System.out.println("vaccination pending");	
	}
else
{
System.out.println("go to child department");
}
}
else
{
System.out.println("go to child department");	
}	
}
}
