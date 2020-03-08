package string;

public class CapToSmallToCaps {
public static void main(String[] args) {
	String s="KaMaL";
	char c[]=s.toCharArray();
	for(int i=0;i<c.length;i++)
	{
		if((c[i]>=(int)65)&&(c[i]<=(int)90))
		{
			System.out.print((char)(c[i]+32)+" ");
		}
		else if((c[i]>=(int)97)&&(c[i]<=(int)122)) 
		{
			System.out.print((char)(c[i]-32)+" ");
		}
			
		 
		
	}
}
}
