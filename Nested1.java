package day19;

public class Nested1 
{
	public static void main(String args[])
	{
		Atherius at = new Atherius("<이곳은 에이테리우스의 영역>\n○(Magnus)");
		Atherius.Oblivion ob = at.new Oblivion("\t<이곳은 오블리비언의 영역>\n\to(Secunda)\n\tO(Masser)");
		Atherius.Oblivion.Nirn nr = ob.new Nirn("\t\t<이곳은 넌의 영역>");
		at.Say();
		System.out.println("{");
		ob.Say();
		System.out.println("\t{");
		nr.Say();
		System.out.println("\t\t{\n\t\t}");
		System.out.println("\t}");
		System.out.println("}");
	}
}
class Atherius
{
	String name;
	public Atherius(String name) 
	{
		super();
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	void Say()
	{
		System.out.println(name);
	}
	class Oblivion
	{
		String name2;
		
		public Oblivion(String name2) 
		{
			super();
			// TODO Auto-generated constructor stub
			this.name2=name2;
		}
		void Say()
		{
			System.out.println(name2);
		}
		class Nirn
		{
			String name3;

			public Nirn(String name3) 
			{
				super();
				// TODO Auto-generated constructor stub
				this.name3=name3;
			}
			void Say()
			{
				System.out.println(name3);
			}
		}
	}
}
