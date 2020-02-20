package Day_1;

public class digits {

	public static void main(String[] args) {
		int n=5678,rem=0;
		while(n>0)
		{
			rem=n%10;
			System.out.println(rem);
			n=n/10;
		}
		// TODO Auto-generated method stub

	}

}
