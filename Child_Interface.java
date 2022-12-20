package day12;
import java.util.Scanner;
// implements: Interface version of extends
// Multiple inheritance is available. (Not available for extends)
public class Child_Interface implements Parent_Interface
{
	Scanner sc = new Scanner(System.in);
	int money;
	public int deposit()
	{
		System.out.print("입금액: ");
		return sc.nextInt();
	}
	@Override
	public int getMoney()
	{
		return money;
	}
	@Override
	public void setMoney(int money)
	{
		this.money=money;
	}
}
