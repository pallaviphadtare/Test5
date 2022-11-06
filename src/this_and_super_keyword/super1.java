package this_and_super_keyword;

public class super1 extends this1
{
int a=10;
int y=50;
int c=70;
public void m1() 
{
	int y=30;
	System.out.println(y);
	System.out.println(this.a);
	System.out.println(this.y);
	System.out.println(this.c);
	System.out.println(super.a);
	
	// super keyword is used to access global variable from super class when global variable names are same in both the classes 
	// i.e sub class n super class
	
	System.out.println(super.c);
}
public static void main(String[] args) 
{

	super1 S1=new super1();
	S1.m1();
	
}	
	
	
	
	
	
}
