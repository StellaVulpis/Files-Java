package day13;

public class FoxandWolf 
{
	public static void main(String args[])
	{
		String line="-------------------------------------------------------------";
		FoxDA fox = new FoxDA();
		WolfDA wolf = new WolfDA();
		fox.In();
		fox.Out(line);
		System.out.println();
		wolf.In();
		wolf.Out(line);
	}
}


