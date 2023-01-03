package day22;

public class ListDTO22 implements Comparable<ListDTO22>
{
	String name, address, favFood;
	int age;
	@Override
	public int compareTo(ListDTO22 o) 
	{
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	public ListDTO22(String name, String address, String favFood, int age)
	{
		super();
		this.name = name;
		this.address = address;
		this.favFood = favFood;
		this.age = age;
	}
	@Override
	public String toString() 
	{
		return "Name: " + name + " | Address: " + address + " | Favorite food: " + favFood + " | Age:" + age;
	}
	
}
