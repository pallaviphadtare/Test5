package Practice;

abstract public class demo1
{
	abstract void m1();
	public static void m2(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	public void m3()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args)
	{
		m2(10,30);
		
	}
}
