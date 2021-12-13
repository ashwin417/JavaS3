import java.util.*;
class strrep
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
				System.out.print("enter the string");
		String a = sc.nextLine();
		int len = a.length();
		int i;
		
				System.out.print("enter the character to be replaced: ");
		char s = sc.next().charAt(0);
		
				System.out.print("ENter the character to replace the existing character: ");
		char r = sc.next().charAt(0);
		
				a = a.replace(s,r);
				
			
				System.out.print("String after replacing : ");
				System.out.println(a);
	}
}
