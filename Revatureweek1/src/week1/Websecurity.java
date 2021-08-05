package week1;

import java.util.Scanner;

public class Websecurity{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String d=sc.nextLine();
		if(d.startsWith("https"))
		{
			System.out.println("secure");
		}
		else if(d.startsWith("http"))
		{
			System.out.println("not secure");
		}
		
		
	}

}
