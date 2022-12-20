package day12;
import java.util.Scanner;
public class nameSearch_Input 
{
	Scanner sc = new Scanner(System.in);
	String nameScan(String text) // Input method for getter and setter, just use sc for variables.
	{
		System.out.print(text+": ");
		return sc.next();
	}
}
