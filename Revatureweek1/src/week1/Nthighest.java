package week1;
import java.util.Scanner;
import java.util.Arrays;

public class Nthighest {
	public static int nthlargest(int[] arr,int nth,int size)
	{
	 Arrays.sort(arr);
	 int c=1;
	 int x=0;
	 for(int i=size-1;i>0;i--)
	 {
		 if(arr[i]!=arr[i-1])
			 c++;
		 if(c==nth)
		 {
		    x=arr[i-1];
		    break;
		    
		 }
			 
	 }
	 return x;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		//int nth=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		int nth=sc.nextInt();
		System.out.println(nthlargest(arr,nth,size));

	}

}
