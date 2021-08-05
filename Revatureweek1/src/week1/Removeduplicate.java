package week1;


import java.util.Scanner;
import java.util.Arrays;

public class Removeduplicate{
	public static void remdup(int[] arr,int size)
	{
	 Arrays.sort(arr);
	 int c=0;
	 int[] temp=new int[size];
	 for(int i=0;i<size-1;i++)
		 if(arr[i]!=arr[i+1])
		 {
			 temp[c]=arr[i];
	         c++;
		 }
	 temp[c]=arr[size-1];
	 for(int j=0;j<=c;j++)
		 System.out.println(temp[j]);
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
		remdup(arr,size);

	}

}
