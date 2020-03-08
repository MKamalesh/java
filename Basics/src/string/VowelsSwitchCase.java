package string;

public class VowelsSwitchCase {
public static void main(String[] args) {
	String[] name= {"kamal","Imzath","selva"};
	int i=0,count=0;
	while(i<name.length)
	{
		char[] ch=name[i].toCharArray();
		char f=ch[0];
		switch (f)
		{
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
		case 'i':
		case 'I':count++;
		}
		i++;
	}
	System.out.println(count);
}
}
