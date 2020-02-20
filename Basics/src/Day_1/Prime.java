package Day_1;

public class Prime {

	public static void main(String[] args) {
		int n=3,Count=1;
		System.out.print("2"+" ");
		while(Count<20)
		{
		int div=3;
	    boolean check=true;
	    if(n%2!=0)
		{
			while(div<n)
			{
				if(n%div==0)
				{
					//System.out.println("not prime");
					check=false;
					break;
				}
				div=div+2;
			}
			if(check==true)
			{
				System.out.print(n+" ");
				Count++;
			}
		}
		else {
			System.out.println(n);
			Count++;
		}
		n=n+2;
	    }
	
		// TODO Auto-generated method stub

	}

}
