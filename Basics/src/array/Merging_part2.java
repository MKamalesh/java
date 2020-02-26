package array;

public class Merging_part2 {
public static void main(String[] args) {
	int a[]= {1,2,3,4};
	int b[]= {5,6};
	int result[]=new int[a.length+b.length];
	int k=0;
	for(int i=0;i<result.length;i++)
	{
		if(i<a.length)
		{
			result[i]=a[i];
		}
		else {
			result[i]=b[k];
			k++;
		}
	}
	for(int i=0;i<result.length;i++)
	{
		System.out.print(result[i]+" ");
	}
}
}
