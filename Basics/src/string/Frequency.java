package string;

public class Frequency {
public static void main(String[] args) {
	String s="CHennai Velachery";
	s=s.toLowerCase();
	char[] c=s.toCharArray();
	int freq[]=new int[c.length];
	for(int i=0;i<c.length;i++)
	{
		freq[i]=1;
		for(int j=i+1;j<c.length;j++)
		{
			if(c[i]==c[j])
			{
				freq[i]++;
				c[j]='0';
			}
			
		}
	}
		for(int i=0;i<freq.length;i++)
		{
			if(c[i]!=' '&&c[i]!='0')
			{
				System.out.println(c[i]+" "+"occurs"+" "+freq[i]+" "+"times");
			}
		}
	
}
}
