package Constructor;

public class Test2
{
int A;			//non static global variable declaration
int B;			//non static global variable declaration
Test2()			//user defined constructor - used To initialize variable
{
A=100;			//non static global variable initialization
B=500;			//non static global variable initialization
}
public void Addition() 
{
int Sum=A+B;
System.out.println(Sum);
}

public void Multiplication() 
{
int Mul=A*B;
System.out.println(Mul);
}


}
