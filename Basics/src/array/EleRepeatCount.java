 package array;

public class EleRepeatCount {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,10,25,20};
		int search[]= {10,20};
		int j=0;
		while(j<search.length)
		{
			int i=0,count=0;
			while(i<a.length)
			{
			if(a[i]==search[j])
			{
				count++;
			}
			i++;
			}
			System.out.println(count);
			j++;
			
		}
		// TODO Auto-generated method stub

	}

}
