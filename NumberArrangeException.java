package day21;
// import day21.NumberArrangeException; // >> for classes in other package
public class NumberArrangeException extends Exception
{
	private static final long serialVersionUID = 1125437234L;
	static String errMsg;
	public NumberArrangeException()
	{}
	public static void forInputArrange(int n) throws NumberArrangeException 
	{
		try
		{
			if(n > 9)
			{
				errMsg="The number you've entered was out of range, please try again.";
				throw new NumberArrangeException();
			}
			else if(n < 2)
			{
				errMsg="The number you've entered was out of range, please try again.";
				throw new NumberArrangeException();
			}
			}catch(NumberArrangeException e)
			{
				System.err.println(errMsg);
				e.printStackTrace();
				System.exit(0);
			}
	}
}
