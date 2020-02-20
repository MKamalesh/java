package Day_1;

public class SmallestDiv {

	public static void main(String[] args) {
		int n=1995,div=2;
		while(div<=n) {
			if(n%div==0)
			{
				System.out.println(div);
				break;
			}
			div++;
		}
		// TODO Auto-generated method stub

	}

}
