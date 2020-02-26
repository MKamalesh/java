package array;

import java.util.Scanner;

public class arrayScanner {
	public static void main(String[] args) {
		int total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:");
		int len=sc.nextInt();
		int marks[]=new int[len];
		for(int i=0;i<len;i++)
		{
			System.out.println("Enter:");
			marks[i]=sc.nextInt();
			total=total+marks[i];
		}
		System.out.println(total);
		sc.close();
	}

}
