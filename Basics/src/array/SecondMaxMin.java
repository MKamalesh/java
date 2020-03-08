package array;

public class SecondMaxMin {
public static void main(String[] args) {
	int a[]= {10,2,8,3,5,11,4,15};
	int max=Integer.MIN_VALUE;
	int max2=Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	int min2=Integer.MAX_VALUE;
	int len=a.length;
	int i;
	for(i=0;i<len;i++)
	{
		if(a[i]>max)
		{
			max2=max;
			max=a[i];
		}
		else if(a[i]>max2)
		{
			max2=a[i];
		}
	}
	System.out.println("max2:"+max2);
	for(i=0;i<len;i++)
	{
		if(a[i]<min)
		{
			min2=min;
			min=a[i];
		}
		else if(a[i]<min2)
		{
			min2=a[i];
		}
	}
	System.out.println("min2:"+min2);
}
}
