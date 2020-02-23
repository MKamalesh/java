package Day_1;

public class SumDigSingle {

	public static void main(String[] args) {
		int n=123456789,rem=0,sum=0;
		do {
			sum=0;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		n=sum;
	}while(sum>9);
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
