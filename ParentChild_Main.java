package day12;

public class ParentChild_Main 
{
	public static void main(String args[])
	{
		Child_Interface chd = new Child_Interface();
		System.out.println("자식에게 입금할 금액을 입력.");
		chd.setMoney(chd.deposit());
	}
}
