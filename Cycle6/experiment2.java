
class experiment2
{
	public static void main(String[] args )
	{
		try{
			int b = 100;
			if(b<500)
				throw new balanceException();
		
		}
		catch(balanceException e)
		{
			System.out.println(e);
		}
	}
}

class balanceException extends Exception
{
	balanceException()
	{
		System.out.print("Low balance ");
	}
}

