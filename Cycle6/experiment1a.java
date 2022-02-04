class experiment1a
{
	public static void main(String[] args)
	{
		try
			{
		int b, a = 5;
		b = a/0;
		System.out.println(b);
			}
		catch(ArithmeticException e)
			{
				System.out.println(e);
			}
	}	
}	
