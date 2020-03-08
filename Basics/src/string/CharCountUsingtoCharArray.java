package string;

public class CharCountUsingtoCharArray {
public static void main(String[] args) {
	String name="kAmal";
	char c='a';
	int count=0;
	char ch[]=name.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if((ch[i]==c)||(ch[i]==c-32))
		{
			count++;
		}
	}
	System.out.println(count);
	//int j=(int)c;
	//System.out.println();
}
}
