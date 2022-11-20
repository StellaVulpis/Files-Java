package build02;
import java.util.Scanner;
public class pencil_per_ST 
{
	public static void main(String[] args) 
	{
		int pencils = 534, student = 30;
		int pencilperST = pencils / student;
		int pencilLeft = pencils - (pencilperST * student);
		System.out.print(pencilperST);
		System.out.printf("\n");
		System.out.print(pencilLeft);
		
		
		

	}
}
