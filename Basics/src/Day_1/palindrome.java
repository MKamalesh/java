package Day_1;

public class palindrome {

	public static void main(String[] args) {
		int n=143,rem=0,rev=0;
		int n1=n;
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println(rev);
		if(n1==rev)
		{
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		// TODO Auto-generated method stub

	}

}
