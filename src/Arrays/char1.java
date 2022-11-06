package Arrays;

import java.util.Arrays;

public class char1 
{
	public static void main(String[] args) 
	{
	
		  char C1[]=new char[4];
		 
		 C1[0]='P';
		 C1[1]='M';
		 C1[2]='S';
		 C1[3]='A';
		 Arrays.sort(C1);
		for(int a=0; a<=C1.length-1; a++) 
		{
			System.out.println(C1[a]);
		}
	
for(int b=C1.length-1; b>=0; b--)
{
	System.out.println(C1[b]);
}
	
	
	
	
	
	
	
	
	
	}	
	
}
