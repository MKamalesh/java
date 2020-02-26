package array;

public class AddEleinArray {
	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5};
		int n=6;
		int len=a1.length;
		int a2[]=new int[len+1];
		int len2=a2.length;
		a2[len2-1]=n;
		for(int i=0;i<a1.length;i++)
		{
			a2[i]=a1[i];
		}
		for(int i=0;i<a2.length;i++)
		{
			System.out.println(a2[i]);
		}
	}
	

}
