
package Day_1;

public class BinToDec {

	public static void main(String[] args) {
		int n=1001,rem=0,dec=0,power=0;
		while(n>0)
		{
			rem=n%10;
			dec=(int) (dec+(rem*Math.pow(2, power)));
			n=n/10;
			power++;
		}
		System.out.println(dec);
		// TODO Auto-generated method stub

	}

}
