package day12;

// Multiple inheritance from multiple parents(Interfaces).
public class OnlyChild implements ParentA,ParentB,ParentC
{
	int money;
	public void depositFromParentA()
	{
		money+=10000;
		System.out.println("A로부터 받은 금액: "+money);
	}
	public void depositFromParentB()
	{
		money+=10000;
		System.out.println("B로부터 받은 금액: "+money);
	}
	public void depositFromParentC()
	{
		money+=10000;
		System.out.println("C로부터 받은 금액: "+money);
	}
}
