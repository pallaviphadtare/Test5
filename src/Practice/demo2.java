package Practice;

public class demo2 extends demo1
{
	public void m1()
	{
		System.out.println("GM");
	}
	public static void main(String[] args) 
	{
		demo2 D=new demo2();
		D.m1();
		demo2.m2(10,10);
		D.m3();
	}
}
