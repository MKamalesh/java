package array;

public class arrayReverse {
public static void main(String[] args) {
	int a1[]= {1,2,3,4,5};
	int len=a1.length;
	int a2[]=new int[len];
	int i=0,j=a1.length-1;
	while(i<a1.length)
	{
		a2[i]=a1[j];
		System.out.println(a2[i]);
		i++;
		j--;
	}
	
}
}
