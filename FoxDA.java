package day13;

public class FoxDA extends FoxDT implements Canid, IO
{
	// Use same name of method in different classes over and over again without chainging the name. (Interface)
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
		setName("Fox");
		setEat("Canivore");
		setFamily("Canidae");
		setFly(false);
		setAge(4);
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