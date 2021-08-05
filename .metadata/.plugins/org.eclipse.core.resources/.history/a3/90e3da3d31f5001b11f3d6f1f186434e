package week1;

import java.util.Scanner;

public class Palindrome{
	public static boolean ispalin(int n)
	{
		String t=Integer.toString(n);
		int m=t.length();
		for(int i=0;i<m;i++) 
		{
			if(t.charAt(i)!=t.charAt(m-i-1))
			{
					return false;
			}
		}
		return true;
		}
	public static void palind(int[] arr, int size)
	{
	for(int i=0;i<size;i++)
		if(ispalin(arr[i]))
			System.out.print(arr[i]+" ");
	        //System.out.println(" ");
		}


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		//int nth=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		//int nth=sc.nextInt();
	}
}

