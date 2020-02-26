package array;

public class MergeArrays {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {5,6};
		int result[]=new int[a.length+b.length];
		int i;
		for(i=0;i<a.length;i++)
		{
			result[i]=a[i];
		}
		int k=0;
		for(i=i;i<result.length;i++)
		{
			result[i]=b[k];
			k++;
		}
		for(i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
		
	}

}
