package array;

public class ArakoraAddition {
public static void main(String[] args) {
	int a1[]= {1,2,3,4};
	int a2[]= {5,6};
	int len1=a1.length;
	int len2=a2.length;
	int len=len1>len2?len1:len2;
	int addCount=len1<len2?len1:len2;
	int result[]=new int[len];
	int i=0;
	while(i<addCount)
	{
		result[i]=a1[i]+a2[i];
		i++;
	}
	while(i<len)
	{
		result[i]=a1[i];
		i++;
	}
	i=0;
	while(i<len)
	{
		System.out.println(result[i]);
		i++;
	}
}
}
