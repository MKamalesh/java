package Day_1;

public class DecToBin {

	public static void main(String[] args) {
		int n=4;String rem=" ";
		while(n>0)
		{
			rem=(n%2)+rem;
			n=n/2;
		}
		System.out.println(rem);
		
		// TODO Auto-generated method stub

	}

}
