package Casting;

public class Upcasting 
{
public static void main(String[] args) 
{

	Demo2 D1=new Demo2();
	D1.Car();
	D1.Money();
	D1.Home();
	D1.Mobile();
	
	System.out.println("---------------------------------");
	
	Demo1 D2=new Demo2();				//Upcasting
	
	D2.Car();
	D2.Money();
	D2.Home();
	
	
}
	
	
	
	
	
	
}
