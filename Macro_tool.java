package build01;

public class Macro_tool 
{
	public static void main(String[] args) 
	{
		System.out.printf("switch(lv_input)\n\n{\n");
		for(int i = 1; i <= 7; i++)
		{
			System.out.printf("interf.fr.add(interf.info%d);\n", i);
		}
	}
}
