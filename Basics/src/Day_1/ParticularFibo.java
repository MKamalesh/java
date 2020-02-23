package Day_1;

public class ParticularFibo {

	public static void main(String[] args) {
		int a=0,b=1,c;
		int count=2;
		while(true)
		{
			c=a+b;
			count++;
			if(count==10)
			{
				System.out.println(c);
				break;
			}
			a=b;
			b=c;
		}
		// TODO Auto-generated method stub

	}

}
