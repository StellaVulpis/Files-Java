package day14;
public interface A_Interface 
{
	final String ln = "\n---------------------------------------------------------\n";
	interface RunInterf
	{
		public void Run();
		public void Exit();
	}
	interface Acts
	{
		public int scanInt(String text);
		public String scanStr(String text);
		public void In();
		public void Out();
		public void Load();
		public void delete();
	}

}
