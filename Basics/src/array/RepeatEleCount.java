package array;

public class RepeatEleCount {

	public static void main(String[] args) {
		int a[]= {10,20,30,10,20,30,10,20,40,50};
		int freq[]=new int[a.length];
		int count;
		for(int j=0;j<a.length;j++)
		{
			 count=1;
			int n=a[j];
			for(int i=j+1;i<a.length;i++)
			{
				if(n==a[i])
				{
					count++;
					freq[i]=-1;
				}
			}
			if(freq[j]!=-1)
			{
				freq[j]=count;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(freq[i]>0)
			{
				System.out.println(a[i]+"count:"+freq[i]);
			}
		}
		// TODO Auto-generated method stub

	}

}
