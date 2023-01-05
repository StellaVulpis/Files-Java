package day24;

public class Map0105_DTO
{
	String item; int val, price, sale;
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	@Override
	public String toString() 
	{
		return " | Sale total: "+sale;
	}
	public String toItem()
	{
		return "Item: "+item;
	}
}
