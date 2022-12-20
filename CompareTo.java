package day12;
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
	public int compareTo(CompareTo cp)
	{
		return name.compareTo(cp.name); // Descending
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