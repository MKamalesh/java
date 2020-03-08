package string;

public class MobileNumCheck {
public static void main(String[] args) {
	String s="9876564321";
	char c[]=s.toCharArray();
	boolean flag=true;
	if(c.length==10)
	{
	for(int i=0;i<c.length;i++)
	{
		if(!((c[i]>=(char)48)&&(c[i]<=(char)57)))
		{
		   flag=false;
	       System.out.println("not mobile number");
	       break;
		}
	
	}

	if(flag==true)
	{
		System.out.println("mobile number");
	}
	}
}
}
