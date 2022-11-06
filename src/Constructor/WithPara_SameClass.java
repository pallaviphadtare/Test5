package Constructor;

public class WithPara_SameClass
{
int sum1;
int sum2;
WithPara_SameClass(int A, int B)
{
	sum1=A;
	sum2=B;
}
public void addition() 
{
int sum=sum1+sum2;
System.out.println(sum);
}
public void Substraction() 
{
int sub=sum1-sum2;
System.out.println(sub);
}
public static void main(String[] args) 
{
	WithPara_SameClass P1=new WithPara_SameClass(500,500);
	P1.addition();
	P1.Substraction();
}





}