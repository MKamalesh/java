package array;

public class SecondMax {
public static void main(String[] args) {
	int n[]= {1,2,3,4,5};
	int max=Integer.MIN_VALUE;
	int max2=Integer.MIN_VALUE;
	for(int i=0;i<n.length;i++)
	{
		if(n[i]>max)
		{
			max2=max;
			max=n[i];	
		}
		else if(n[i]>max2)
		{
			max2=n[i];
		}
	}
	System.out.println(max2);
}
}
