package Day_1;

public class factorial {

	public static void main(String[] args) {
		//int given=5;
/*do {
			int fact=1;
		    int n=1;
		    while(n<=given)
			{
			fact=fact*n;
				n=n+1;
			}
			System.out.println(fact);
			given=given-1;
		}
while(given>0);*/
		int n=5;
		while(n>0)
		{
			int fact=1,i=1;
			while(i<=n)
			{
				fact=fact*i;
				i++;
			}
			System.out.println(fact);
			n--;
		}
		
		// TODO Auto-generated method stub

	}

}
