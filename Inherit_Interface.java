package day13;

public class Inherit_Interface
{
	public static void main(String args[])
	{
		DAO p = new DAO();
		p.In();
		p.Out();
	}
}
// Get data from Normal DTO class, get methods from Interface
class DAO extends DTO2 implements Action
{	
	public void In()
	{
		setA(5);
		setB(4);
		Multiply();
		Sum();
		Devision();
		GetLeft();
	}
	public void Out()
	{
		System.out.println(a+"x"+b+"="+mul);
		System.out.println(a+"+"+b+"="+sum);
		System.out.println(a+"÷"+b+"="+dev);
		System.out.println(a+"%"+b+"="+left);
	}
	@Override
	public void Multiply()
	{
		setMul(a*b);
	}
	@Override
	public void Sum()
	{
		setSum(a+b);
	}
	@Override
	public void Devision()
	{
		setDev(((double)a/(double)b));
	}
	@Override
	public void GetLeft()
	{
		setLeft(a%b);
	}
}
// Normal DTO class which inherited from two interface classes.
class DTO2 implements DTO_AB, DTO_CD
{
	int a,b;
	int mul, sum, left;
	double dev;
	@Override
	public int getA() {
		return a;
	}
	@Override
	public void setA(int a) {
		this.a = a;
	}
	@Override
	public int getB() {
		return b;
	}
	@Override
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public double getDev() {
		// TODO Auto-generated method stub
		return dev;
	}
	@Override
	public void setDev(double dev) {
		this.dev=dev;
	}
	@Override
	public int getMul() {
		// TODO Auto-generated method stub
		return mul;
	}
	@Override
	public void setMul(int mul) {
		// TODO Auto-generated method stub
		this.mul=mul;
	}
	@Override
	public int getSum() {
		// TODO Auto-generated method stub
		return sum;
	}
	@Override
	public void setSum(int sum) {
		// TODO Auto-generated method stub
		this.sum=sum;
	}
	@Override
	public int getLeft() {
		// TODO Auto-generated method stub
		return left;
	}
	@Override
	public void setLeft(int left) {
		// TODO Auto-generated method stub
		this.left=left;
	}
	
}
// Interface classes
interface DTO_AB
{
	public int getA();
	public void setA(int a);
	public int getB();
	public void setB(int b);
	public int getMul();
	public void setMul(int mul);
	public int getSum();
	public void setSum(int sum);
}
interface DTO_CD
{
	
	public double getDev();
	public void setDev(double dev);
	public int getLeft();
	public void setLeft(int left);
}
interface Action
{
	public void Multiply();
	public void Sum();
	public void Devision();
	public void GetLeft();
}
