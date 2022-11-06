package Constructor;

public class WithoutPara_SameClass 
{
	int A;
	int B;
	WithoutPara_SameClass()
	{
	A=400;
	B=200;
	}
		public void Substraction() 
		{
		int Sub=A-B;
		System.out.println(Sub);
		}
		public void Division() 
		{
			int Div=A/B;
			System.out.println(Div);
			
		}
		
		public static void main(String[] args) 
		{
			WithoutPara_SameClass P1=new WithoutPara_SameClass();
			P1.Substraction();
			P1.Division();
		}
		
		
		
	}

