package Interface_Implementation;

public interface Interface2
{

	public int a=10; 				// public,static,final variable
	static int b=20;				// static
	final int c=30;					// final
	
	void m1();				// by default it is public,abstract
	
	public void m2();		//public 
	
	abstract void m3();		// abstract
	
	public abstract void m4();		// public abstract
	
	abstract public void m5();		// abstract public
	
	default void m6() 					// default method in Interface is always a complete method
	{
		System.out.println("M6");
	}
	public static void m7() 			// static method in Interface is always a complete method
	{
		System.out.println("M7");
	}
	static void m8() 
	{
		System.out.println("M8");
	}
	
	
	
	
}
