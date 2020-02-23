package Day_1;

public class LCM {

	public static void main(String[] args) {
		int a=8,b=3;
		int small=a<b?a:b;
		int big=a>b?a:b;
		int biggy=big;
		while(true)
		{
			if(big%small==0)
			{
				System.out.println(big);
				break;
			}
			big+=biggy;
		}
		// TODO Auto-generated method stub

	}

}
