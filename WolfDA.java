package day13;

public class WolfDA extends WolfDT implements Canid, IO
{
	@Override
	public void Run() 
	{
		System.out.print("Message: ");
		System.out.println(getName()+" started running.");
	}
	@Override
	public void Eat() 
	{
		System.out.print("Message: ");
		System.out.println(getName()+" started eating.");
	}
	@Override
	public void In() 
	{
		setName("Wolf");
		setEat("Canivore");
		setFamily("Canidae");
		setFly(false);
		setAge(7);
	}
	@Override
	public void Out(String text) 
	{
		System.out.println(text);
		System.out.println("[Information of this animal]");
		System.out.println(text);
		System.out.println("Name: "+getName());
		System.out.println("Trophic Level: "+getEat());
		System.out.println("Can Fly: "+getFly());
		System.out.println("Age: "+getAge());
		System.out.println(text);
		Run();
		Eat();
		System.out.println(text);
	}
}