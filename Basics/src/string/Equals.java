package string;

public class Equals {
	public static void main(String[] args) {
		String s1="kamal";
		String s2="kamal";
		String s3=new String("kamal");
				
		if(s1==s3)
		{
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		
	}

}
