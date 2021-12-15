import java.util.*;
class strser
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int len = a.length();
		int i,flag=0;
		char s = sc.next().charAt(0);
		for(i=0; i<len ;i++)
		{
			if(a.charAt(i)==s)
			{
				System.out.println("element " + s + " is present at "+ (i+1));
				flag=-1;
				
				
			}
			
		}
		if(flag==0)
		    	System.out.println("element not found");

	}
}
