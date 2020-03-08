package string;

import java.util.Scanner;

public class CheckPassword {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Password:");
	String s=sc.next();
	char c[]=s.toCharArray();
	int noCount=0,capCount=0,speCharCount=0;
	if(c.length<8)
	{
		System.out.println("not valid");
	}
	else {
	for(int i=0;i<c.length;i++)
		{
			if((c[i]>=(char)48)&&(c[i]<=(char)57))
			{
			noCount++;	
			}
			else if((c[i]>=(char)65)&&(c[i]<=(char)90))
			{
				capCount++;
			}
			else if(!(((c[i]>=(char)65)&&(c[i]<=(char)90))&&((c[i]>=(char)97)&&(c[i]<=(char)122))&&((c[i]>=(char)48)&&(c[i]<=(char)57))))
			{
				speCharCount++;
			}
		}
	
	
	if((noCount==0)&&(capCount==0)&&(speCharCount==0))
	{
		System.out.println("not valid");
	}
	else {
		System.out.println("valid");
	}
	}
}
}
