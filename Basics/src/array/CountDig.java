package array;

public class CountDig {

	public static void main(String[] args) {
		int a[]= {12,45,53,54};
		int len=a.length;
		int count=0,rem=0, b;
		for(int i=0;i<len;i++)
		{
		b=a[i];
		while(b>0)
		{
			rem=b%10;
			if(rem==5)
			{
				count++;
				b=b/10;
				break;
			}
			else {
				b=b/10;
			}
		}
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
