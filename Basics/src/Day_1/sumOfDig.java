package Day_1;

public class sumOfDig {

	public static void main(String[] args) {
		int n=1997,sum=0,rem=0;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
