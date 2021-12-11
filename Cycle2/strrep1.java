import java.util.*;
class strrep1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int len = a.length();
		int i;
		char s = sc.next().charAt(0);
		char t = sc.next().charAt(0);
		for(i=0; i<len ;i++)
		{
			if(a.charAt(i)==s)
			{
				a.charAt(i)=t;
				
			}
		}
		System.out.println(a);
	}
}
