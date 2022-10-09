import java.util.*;
public class matrix{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int i=2;
		int j=2;
		int c[][]=new int[i][j];
		int arr[][]=new int[i][j];
		for( i=0;i<2;i++)
		{
			for( j=0;j<2;j++)
			{
				System.out.print("column"+i+","+"row"+j+""+"element"+"");
				arr[i][j]=sc.nextInt();
				
			}
			System.out.println("");
		}
		
		
		
		for( i=0;i<2;i++)
		{
			for( j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+"   ");
				System.out.print("");
				
			}
			System.out.println("");
		}
		
		
		
		for( i=0;i<2;i++)
		{
			for( j=0;j<2;j++)
			{
				
				c[i][j]=arr[i][j]*arr[j][i];
				System.out.print(arr[i][j]+"   ");
				System.out.print("");
				
			}
			System.out.println("");
		}
		for( i=0;i<2;i++)
		{
			for( j=0;j<2;j++)
			{
				
				
				System.out.print(c[i][j]+"   ");
				System.out.print("");
				
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
	}
	
}