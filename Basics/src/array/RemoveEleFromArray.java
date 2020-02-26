package array;

public class RemoveEleFromArray {

	public static void main(String[] args) {
		int i=0,n=3;
		int a[]= {5,3,2,4,7};
		while(i<a.length)
		{
			if(a[i]==n)
			{
				break;
			}
			i++;
		}
		//System.out.println("3 is present in"+i);
		if(i==a.length)
		{
			System.out.println("not present");
		}
		else {
			System.out.println("present");
		}
		for(int j=i;j<a.length-1;j++)
		{
			a[j]=a[j+1];
			// TODO Auto-generated method stub
		}
		for( i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}

	}

}
