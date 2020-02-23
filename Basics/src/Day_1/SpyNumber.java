package Day_1;

public class SpyNumber {

	public static void main(String[] args) {
		int n=1234,rem=0,sum=0,mul=1;
		int a=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			mul=mul*rem;
			n=n/10;
		}
		if(sum==mul)
		{
			System.out.println(a+" "+"is spy number");
		}
		else {
			System.out.println(a+" "+"is not spy number");
		}
		// TODO Auto-generated method stub

	}

}
