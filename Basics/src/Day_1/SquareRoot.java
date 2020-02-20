package Day_1;

public class SquareRoot {

	public static void main(String[] args) {
		int n=121,div=2;
		while(div<=(n/2))
		{
			if((n/div)==div)
			{
				System.out.println(div);
				break;
			}
			div++;
		}
		// TODO Auto-generated method stub

	}

}
