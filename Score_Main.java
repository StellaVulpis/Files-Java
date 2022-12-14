package day08;
public class Score_Main 
{
	public static void main(String args[])
	{
		Score scr = new Score();
		
		scr.scanf();
		scr.Calc();
		System.out.println(scr.print());
		scr.sClose();
		//--------------------------------------------------
		// 'Scanner closed' exception(IllegalStateException)
		// If you use scanner after you close the scanner 
		// Compiler warns you that the Scanner is now closed.
		/* -------------------------------------------------
		*  int num = 0;
		*  num = scr.sc.nextInt();
		*  System.out.println(num);
		*  -------------------------------------------------
		*  java.lang.IllegalStateException: Scanner closed
		*	at java.base/java.util.Scanner.ensureOpen(Scanner.java:1150)
		*	at java.base/java.util.Scanner.next(Scanner.java:1573)
		*	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
		*	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
		*	at day08.Score_Main.main(Score_Main.java:13)
		*/
		//--------------------------------------------------
	}
}
