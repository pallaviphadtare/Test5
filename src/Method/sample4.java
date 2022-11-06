package Method;

public class sample4 
{
public static void main(String[] args) 
{

sample4 File=new sample4();
File.A1();
B1();
}
public void A1() {
System.out.println("Non static regular method");
System.out.println("calling from same class");
}
public static void B1() 
{
System.out.println("Static regular method");	
System.out.println("calling from same class");	
}




}
