package Interface_Implementation;

public interface InterfaceA 
{

	void m1();
	
	void m2();
	
	default void m3() 					
	{
		System.out.println("Method can declare as default in interface");
	}
	
	
}
