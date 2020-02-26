package array;

public class oddIndex {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int result[]=new int[a.length/2];
	int j=1;
for(int i=0;i<result.length;i++)
{
	result[i]=a[j];
	j=j+2;
}
for(int i=0;i<result.length;i++)
{
	System.out.print(result[i]+" ");
}
}
}
