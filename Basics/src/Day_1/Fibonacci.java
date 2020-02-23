package Day_1;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0,b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=2;i<=10;i++)
		{
			//c=a+b;
			//System.out.print(c+" ");
			//a=b;
			//b=c;
			b=a+b;                      //without usind 3rd variables
			System.out.print(b+" ");
			a=b-a;
		}
		// TODO Auto-generated method stub

	}

}
