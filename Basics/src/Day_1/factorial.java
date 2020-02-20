package Day_1;

public class factorial {

	public static void main(String[] args) {
		int given=5;
do {
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
while(given>0);
		
		// TODO Auto-generated method stub

	}

}
