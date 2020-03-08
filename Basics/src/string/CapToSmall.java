package string;

public class CapToSmall {
public static void main(String[] args) {
	char alpha[]= {'K','A','M','A','L'};
	for(int i=0;i<alpha.length;i++)
	{
		char c=(char) (alpha[i]+32);
		System.out.print(c+" ");
	}
}
}
