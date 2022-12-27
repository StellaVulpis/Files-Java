package day17;

import java.util.Arrays;
import java.util.Collections;

public class SortTest 
{
	public static void main(String args[])
	{
		String ln = "\n--------------------------------------------\n";
		String [] names = {"Isabelle","TomNook","Marshal","Digby"};
		Arrays.parallelSort(names); // Ascending order
		System.out.print(ln+"Sorting by ascending order"+ln);
		for(String a:names)
			System.out.println(a);
		System.out.print(ln+"Sorting by descending order"+ln);
		Arrays.sort(names, Collections.reverseOrder()); // Descending order
		for(String a:names)
			System.out.println(a);
	}
}
