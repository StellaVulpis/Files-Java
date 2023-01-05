package day24;
import java.util.Stack;
import TOOL.IOStream;

public class StackTest 
{
	public static void main(String args[])
	{
		Stack<Stack1> st = new Stack<Stack1>();
		Stack1 s1 = new Stack1(0);
		st.push(new Stack1(100));
		st.push(new Stack1(200));
	}
	
}
class Stack1 extends IOStream
{
	public Stack1(int num) 
	{
		this.num=num;
	}
	int num;
	public void out()
	{
		println(num);
	}
}