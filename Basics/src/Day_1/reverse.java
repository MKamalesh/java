package Day_1;

public class reverse {

	public static void main(String[] args) {
		int n=143,rem=0,rev=0;
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println(rev);
		// TODO Auto-generated method stub

	}

}
