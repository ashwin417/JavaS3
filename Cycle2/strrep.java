import java.util.*;
class strrep
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int len = a.length();
		int i;
		char s = sc.next().charAt(0);
		char r = sc.next().charAt(0);
		
				a = a.replace(s,r);
				
			
				System.out.println(a);
	}
}
