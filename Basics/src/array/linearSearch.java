package array;

public class linearSearch {

	public static void main(String[] args) {
		int a[]= {5,10,15,20,25};
		boolean notpresent=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==621)
			{
				notpresent=true;
				System.out.println("available");
				break;
			}
		}
		if(notpresent==false) {
			System.out.println("not available");
		}
		// TODO Auto-generated method stub

	}

}
