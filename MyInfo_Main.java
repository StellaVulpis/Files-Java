package day16_test_feedback;
import java.util.Scanner;
public class MyInfo_Main 
{
	String ln = "\n--------------------------------------------------------------\n";
	public static void main(String args[])
	{
		MyInfo_Main my = new MyInfo_Main();
		MyInfo_DAO d = new MyInfo_DAO();
		while(true)
		{
			int sel=0;
			System.out.println("1. Input\t2. Output\t3. Finish");
			sel=my.scInt("Select one among the menu");
			switch(sel)
			{
			case 1:
				d.input();
				break;
			case 2:
				d.output();
				break;
			case 3: 
				d.fin();
				break;
			}
		}
	}
	String scStr(String text)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(text+": ");
		return sc.nextLine();
	}
	int scInt(String text)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(text+": ");
		return sc.nextInt();
	}
}
