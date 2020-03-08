package Day_1;

public class PowerMul {
	public static void main(String[] args) {
		int n=5,value=1;
		for(int p=1;p<=n;p++) {
			for(int i=1;i<=p;i++)
			{
				value=value*i;
			}
			System.out.println(value);
			value++;
		}
	}

}
