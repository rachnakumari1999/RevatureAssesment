package week1;
//import java.util.Scanner;

public class Lastletteruppercase
{

	public static void main(String[] args) 
	{
		String str="hiiii hello girls";
		String[] st=str.split(" ");
		int j;
		//str ="";
		for(int i=0;i<st.length;i++)
		{
		  j=st[i].length()-1;
		  char s=Character.toUpperCase(st[i].charAt(j));
		  str=st[i].substring(0,j)+s;
		  System.out.print(str+" ");
		  
		}
		

	}

}
