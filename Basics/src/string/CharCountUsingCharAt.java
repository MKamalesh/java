package string;

public class CharCountUsingCharAt {
public static void main(String[] args) {
	String name="kAmal";
	char c='a';
	int count=0;
	for(int i=0;i<name.length();i++)
	{
		if((name.charAt(i)==c)||(name.charAt(i)==c-32))
		{
			count++;
		}
	}
	System.out.println(count);
	System.out.println(name.toLowerCase());
	System.out.println(name.toUpperCase());
}
}
