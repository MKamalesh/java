package array;

public class SecondMin {
public static void main(String[] args) {
	int min=Integer.MAX_VALUE;
	int min2=Integer.MAX_VALUE;
	int n[]= {1,2,3,4,5};
	for(int i=0;i<n.length;i++)
	{
		if(n[i]<min)
		{
			min2=min;
			min=n[i];
		}
		else if(n[i]<min2)
		{
			min2=n[i];
		}
	}
	System.out.println(min2);
}
}
