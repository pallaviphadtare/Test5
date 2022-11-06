package Control_Statements;

public class Nested_if_1 
{
public static void main(String[] args) 
{
String username="Pallavi";
String password="*****";
if("Pallavi"==username) 
{
System.out.println("user name is correct");	
	if("******"==password)
	{
	System.out.println("successful loged in");
	}
	else 
	{
	System.out.println("login is not sucessful");
	}
}
else 
{
System.out.println("user name is wronge");	
}
}
}

