package day20;

public class Item1230_DTO implements Comparable<Item1230_DTO>
{
	public String items; // a, b, m
	public int price, val, sale;
	String name;
	String address;
	int age;
	
	@Override
	public String toString() {
		return   name+"\n"+age+"\n"+address+"\n"+items+"\n"+price+"\n"+val+"\n"+sale;
	}
	@Override
	public int compareTo(Item1230_DTO o) 
	{
		return name.compareTo(o.name);
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
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	
	
}
