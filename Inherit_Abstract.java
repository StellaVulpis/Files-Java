package day13;

public class Inherit_Abstract 
{
	public static void main(String args[])
	{
		Sum p = new Sum();
		Multiply x = new Multiply();
		p.In();
		p.Out();
		x.In();
		x.Out();
	}
}
class Sum extends DTO
{
	public void In()
	{
		setA(5);
		setB(4);
	}
	public void Out()
	{
		System.out.println(aa+"+"+bb+"="+(aa+bb));
	}
}
// Inheritance from normal class
class Multiply extends DTO
{	
	public void In()
	{
		setA(5);
		setB(4);
	}
	public void Out()
	{
		System.out.println(aa+"x"+bb+"="+(aa*bb));
	}
}
// Inheritance from abstract class
class DTO extends DTOAB
{
	int aa,bb;
	@Override
	public int getA() {
		return aa;
	}
	@Override
	public void setA(int aa) {
		this.aa = aa;
	}
	@Override
	public int getB() {
		return bb;
	}
	@Override
	public void setB(int bb) {
		this.bb = bb;
	}
}
// Parent abstract class
abstract class DTOAB
{
	public abstract int getA();
	public abstract void setA(int aa);
	public abstract int getB();
	public abstract void setB(int bb);
}