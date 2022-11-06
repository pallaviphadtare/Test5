package Control_Statements;

public class else_if_2 
{
public static void main(String[] args) 
{
	int score=25;
	if(score>=70) 
	{
		System.out.println("Distinction");
	}
	else if(score>=65) 
	{
		System.out.println("First Class");
	}
	else if(score>=60) 
	{
	System.out.println("Higher Second Class");	
	}
	else if(score>=55) {
		System.out.println("Second Class");
	}
	else if(score>=35) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}
}
}
