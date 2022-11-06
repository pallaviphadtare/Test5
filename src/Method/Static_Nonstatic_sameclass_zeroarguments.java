package Method;

public class Static_Nonstatic_sameclass_zeroarguments
{
public static void main(String[] args)
{

	M1();
	Static_Nonstatic_sameclass_zeroarguments sum=new Static_Nonstatic_sameclass_zeroarguments();
	sum.M2();
	
}
public static void M1() 
{
	int A=10;
	int B=10;
	int C=10;
	int Add=A+B+C;
System.out.println(Add);	
}
public void M2() 
{
	int A=10;
	int B=10;
	int C=10;
	int Add=A+B+C;
System.out.println(Add);
}

}
