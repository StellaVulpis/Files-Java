package day19;

public class NestedTEST 
{
	public static void main(String args[])
	{
		String ln = "\n------------------------------------------------------------\n";
		KoreaOut k1 = new KoreaOut("Marshal", "Anima Island");
		KoreaOut.KoreaIn k2 = k1.new KoreaIn(28, "0700-15425-24-211422");
		Neighbor nb = new Neighbor(null, null);
		System.out.print(ln+"[Nested Classes]\n");
		k1.Say();
		k2.Say();
		System.out.print(ln+"[Inherited class]\n");
		nb.Say();
	}
}
class KoreaOut
{
	String name, address;
	public KoreaOut(String name, String address) 
	{
		super();
		// TODO Auto-generated constructor stub
		this.name=name;
		this.address=address;
	}
	public void Say()
	{
		System.out.println("이름: "+name+"\n주소: "+address);
	}
	class KoreaIn
	{
		int age; String phone;
		public KoreaIn(int age, String phone)
		{
			this.age=age;
			this.phone=phone;
		}
		public void Say()
		{
			System.out.println("나이: "+age+"\n전화번호: "+phone);
		}
	}
}
class Neighbor extends KoreaOut
{

	public Neighbor(String name, String address) 
	{
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	public void Say()
	{
		System.out.println("I am neighbor of the Marshal. (Inherited class)");
	}
}