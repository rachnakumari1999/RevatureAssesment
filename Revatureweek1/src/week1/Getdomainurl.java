package week1;

import java.util.Scanner;

public class Getdomainurl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter url:");
		String s=sc.nextLine();
		String st[]=s.split("/");
		System.out.println(st[2]);

	}

}
