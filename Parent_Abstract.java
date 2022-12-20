package day12;

public class Parent_Abstract 
{
	Parent_Abstract(String name, int money)
	{
		this.name=name;
		this.money=money;
	}
	String name;
	int money;
	
	public void outParent()
	{
		System.out.println("Name: "+name);
		System.out.println("Balance: "+money);
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getMoney() 
	{
		return money;
	}
	public void setMoney(int money) 
	{
		this.money = money;
	}
}
