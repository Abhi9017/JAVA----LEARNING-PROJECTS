import  java.util.*;
public class s
{
	public static void main(String args[])
	{
		int r[][]=new int[2][2];
		int s[][]=new int[2][2];
		
	Scanner sc=new Scanner(System.in);

	/* 3*3 inialsiron*/
	
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.println("enter"+i+" " +j+"Elemenet");
			
			s[i][j]=sc.nextInt();
		}
		
	}
	
	/*  3*3 multi*/
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++){
			for(int k=0;k<2;k++)
			{
		 r[i][j]=s[i][k]*s[k][j];
		}
	}
	}
	
	
	
	
	
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
	System.out.print(r[i][j]);
	System.out.print(" " );
	}
	System.out.println();
	}
	}
}