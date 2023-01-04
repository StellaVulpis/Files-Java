package day23;

public class ListDTO 
{
	String name, address; int age; String favFruit;
	public ListDTO(String name, String address, String age) 
	{
		super();
		this.name = name;
		this.address = address;
		this.age = Integer.parseInt(age);
	}
	public ListDTO() {}
	@Override
	public String toString() 
	{
		return "name: " + name + "address: " + address + " age: " + age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFavFruit() {
		return favFruit;
	}
	public void setFavFruit(String favFruit) {
		this.favFruit = favFruit;
	}
	
}
