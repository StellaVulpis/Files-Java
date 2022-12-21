package day12;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class CompareTo implements Comparable<CompareTo>
{
	int num1, num2;
	String name;
	//------------------------------------------------------------------------------------------------------
	public String getName() {
		return name;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public void setName(String name) {
		this.name = name;
	}
	//------------------------------------------------------------------------------------------------------
	@Override
	// Comparing String variables
	public int compareTo(CompareTo o)
	{
		return name.compareTo(o.name); // Descending
		// return cp.name1.compareTo(name2); // Ascending
	}
	//-----------------------------------------------------
	// Comparing int variables(Numbers)
	/*
	 * public int compareTo(CompareTo cp)
	{
		if(num1 >= cp.num2)
			return -1;
		else if(num1 == cp.num2)
			return 0;
		else
			return 1;
	}
	 * */
	//------------------------------------------------------
}
class DAO // Seperate this class to other file when using.
{
	ArrayList<CompareTo> list = new ArrayList<CompareTo>();
	Scanner sc = new Scanner(System.in);
	void in()
	{
		CompareTo dat = new CompareTo();
		while(true)
		{
			int sel = sc.nextInt();
			if(sel == 9)
			{
				sc.close();
				return;
			}
			dat.setName(scStr());
			dat.setNum1(scInt());
			dat.setNum2(scInt());
			list.add(dat); // use this line to add objects to ArrayList
		}
	}
	void out()
	{
		System.out.println("Name\tNum1\tNum2");
		Collections.sort(list);
		for(CompareTo a:list)
		{
			System.out.println(a.getName());
			System.out.println(a.getNum1());
			System.out.println(a.getNum2());
		}
	}
	String scStr()
	{
		return sc.nextLine();
	}
	int scInt()
	{
		return sc.nextInt();
	}
}
