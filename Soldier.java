package day12;

public class Soldier implements Airforce,Military,Navy
{
	String answer;
	Soldier()
	{
		answer=" ";
	}
	public static void main(String args[])
	{
		Soldier sl = new Soldier();
		sl.Msg();
	}
	@Override
	public void jointheAirforce(String text)
	{
		System.out.println(text);
	}
	@Override
	public void jointheArmy(String text)
	{
		System.out.println();
	}
	@Override 
	public void jointheNavy(String text)
	{
		System.out.println();
	}
	private void line()
	{
		System.out.println();
	}
	public void Msg()
	{
		if(answer.equals(" "))
		{
			jointheAirforce("Airforce: Hey! Why don't you join our Airforce! You can fly above the sky!");
			jointheArmy("Military: Hey son! How about you join the Army! Uncle Sam awaits you!");
			jointheNavy("Hey friend! Join our navy and travel all over the world with our magnificent mothership!");
		}
		else if(answer.equals("Airforce"))
		{
			jointheAirforce("Welcome to Airforce");
		}
		else if(answer.equals("Army") || answer.equals("Military"))
		{
			jointheArmy("Welcome to Army!");
		}
		else if(answer.equals("Navy"))
		{
			jointheNavy("Welcome to Navy!");
		}
		else
			return;
	}
}
