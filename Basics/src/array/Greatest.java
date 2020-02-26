package array;

public class Greatest {
public static void main(String[] args) {
	int n[]= {3,-5,7,-8,6};
	int max=Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	for(int i=0;i<n.length;i++)
	{
		if(max<n[i])
		{
			max=n[i];
		}
		if(min>n[i])
		{
			min=n[i];
		}
	}
	System.out.println(max);
	System.out.println(min);

}
}
