package this_and_super_keyword;

public class this1 
{
int a=20;	// non static global varibale
int c=10;
public void m1() 
{
int a=30;
int c=40;
System.out.println(a);
System.out.println(this.a);	

// this keyword is used to access global variable from same class when local n global variable names are same

System.out.println(c);
System.out.println(this.c);
}
	
public static void main(String[] args)
{
this1 T1=new this1();
T1.m1();

}

		










}
