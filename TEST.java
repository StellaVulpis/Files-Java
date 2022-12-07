package day01;

public class TEST extends Sample2
{
	public static void main(String[] args) 
	{
		int a = 4;
		System.out.println("My First Java Variable: A = "+a);
		System.out.println();
		System.out.printf("HELLO WORLD!\n");
		System.out.println();
		Sample2 obj = new Sample2();
		int x = 10;
		int y = 12;
		obj.x = x;
		obj.y = y;
		obj.add();
	}
}
class Sample2 
{
	int x, y, result;
	void add()
	{
		for(int i = 0; i < 5; i++)
			System.out.printf("%d\n", result += (x+y));
		System.out.println("Total: " + result);
	}
}