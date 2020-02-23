package Day_1;

public class Armstrong {

	public static void main(String[] args) {
		int n=153,rem=0,mul=1,sum=0;
		int a=n;
		while(n>0)
		{
			rem=n%10;
			mul=rem*rem*rem;
			sum=sum+mul;
			n=n/10;
		}
		if(a==sum)
		{
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("not a Armstrong number");
		}
		// TODO Auto-generated method stub

	}

}
