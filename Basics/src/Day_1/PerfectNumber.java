package Day_1;

public class PerfectNumber {

	public static void main(String[] args) {
		int n=12,sum=0;
		int a=n;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(a==sum)
		{
			System.out.println("Perfect number");
		}
		else {
			System.out.println("not Perfect number");
		}
		// TODO Auto-generated method stub

	}

}
