package Method;

public class withparameter {
public static void main (String[] args) {
	addition();
addition(10,20);
addition(10,20,30);
Withpara1.multiplication(20,90,10);
Withpara1.multiplication(40,60);
withparameter Z=new withparameter();
Z.addition("PALLAVI");
Withpara1 M1=new Withpara1();
M1.Rollno(40);
Withpara1.Add("Vishal");
M1.Div("lotus");
}

public static void addition() {
	int a=10;
	int b=20;
	int sum1=a+b;
	System.out.println(sum1);
	}
public static void addition(int a, int b) {
	int sum1=a+b;
	System.out.println(sum1);
}

public static void addition(int a, int b, int c) {
	int sum1=a+b+c;
	System.out.println(sum1);
}
public void addition(String Name) 
{
	System.out.println(Name);
}

}