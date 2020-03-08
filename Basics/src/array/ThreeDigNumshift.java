package array;

public class ThreeDigNumshift {
public static void main(String[] args) {
	int a[]= {100,3,4444,478};
	int len=a.length;
	int res[]=new int[len];
	int i,j=0,b,rem;
	int c=len-1;
	for(i=0;i<len;i++)
	{ 
		int count=0;
		b=a[i];
		while(b>0)
		{
			rem=b%10;
			count++;
			b=b/10;
		}
		if(count==3)
		{
			res[j]=a[i];
			j++;
		}
		else {
			res[c]=a[i];
			c--;
		}
		
	}
	for(j=0;j<len;j++)
	{
		System.out.println(res[j]);
	}
}
}
