package day16_test_feedback;

public class CustomException_TEST 
{
	public static void main(String args[])
	{
		/*
		YoinkException y = new YoinkException();
		int n = 1;
		if(n==0)
			y.Yoink("Yoink");
		else if(n==1)
			y.Yoink("Just an awesome text.");
		else
			y.Yoink("Third one? Heh, I didn't see that coming.");
			*/
		NumBiggerthanFiftyException n50 = new NumBiggerthanFiftyException();
		n50.NumBig(57);
	}
}
class YoinkException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	void Yoink(String text)
	{
		try
		{
			if(text.equals("Yoink"))
				throw new YoinkException();
			else
				System.out.println(text);
		}catch(YoinkException e)
		{
			System.err.println("Yoink! It is an custom exception I made.");
			e.printStackTrace();
		}
		finally
		{
			System.err.println("Message: System was terminated.");
		}
	}
}
class NumBiggerthanFiftyException extends Exception
{
	void NumBig(int num)
	{
		try
		{
			if(num >= 50)
			{
				System.err.println("INFO: Your number is bigger than 50, it is "+num);
				throw new NumBiggerthanFiftyException();
			}
			else
				System.out.println("Your number is smaller than fifty, it is "+num);
		}catch(NumBiggerthanFiftyException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.err.println("Message: System was terminated.");
		}
	}
}
