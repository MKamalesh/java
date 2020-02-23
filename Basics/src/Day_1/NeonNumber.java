package Day_1;

public class NeonNumber {

	public static void main(String[] args) {
		int n=9,rem=0,mul=0,sum=0;
		int a=n;
		mul=n*n;
		while(mul>0)
		{
			rem=mul%10;
			sum=sum+rem;
			mul=mul/10;
		}
		if(a==sum)
		{
			System.out.println("Neon Number");
		}
		else {
			System.out.println("not Neon Number");
		}
		// TODO Auto-generated method stub

	}

}
