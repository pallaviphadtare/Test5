package Control_Statements;

public class else_if_3 
{
	public static void main(String[] args) 
	{
		 int marks=57;                     //Variable declaration and initialization
		
		 	 //57>=65
		if(marks>=65)                                     //condition check
		{
		     System.out.println("Distinction");	
		}
		      //57>=60        
		else if(marks>=60)                              //condition check
		{
			System.out.println("First class");
		}
		        //57>=55    
		else if(marks>=55)                              //condition check
		{
			System.out.println("second class");
		}  
		else if(marks>=45)                                //condition check
		{
			System.out.println("Higher second class");
		}
		else if(marks>=35)                                //condition check
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}


