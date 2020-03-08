package string;

public class LastCharCaps {
	public static void main(String[] args) {
	String name="kamal";
	char c[]=name.toCharArray();
	for(int i=0;i<c.length;i++)
	{
		if(c[i]=='l')
		{
			System.out.println((char)(c[i]-32));
		}
	}
	}
}
