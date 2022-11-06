package Arrays;

public class int3 
{
	public static void main(String[] args)
	{
			// array declaration
		int obj[]=new int[10];
		
		//array initialization
		
		obj[0]=2;
		obj[1]=4;
		obj[2]=6;
		obj[3]=8;
		obj[4]=10;
		obj[5]=12;
		obj[6]=14;
		obj[7]=16;
		obj[8]=18;
		obj[9]=20;
		
		// usage
		System.out.println(obj.length);
	for(int A=0; A<=obj.length-1; A++) 
	{
		System.out.println(obj[A]);
	}
	
}
}