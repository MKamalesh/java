package string;

public class EvenCharCaps {
public static void main(String[] args) {
	String s="kamal";
	char c[]=s.toCharArray();
	for(int i=0;i<c.length;i++)
	{
		if(i%2==0)
		{
		System.out.print((char)(c[i]-32)+" ");
		}
		else {
			System.out.print(c[i]+" ");
		}
	}
}
}
