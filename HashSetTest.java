package day22;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;
import TOOL.IOStream;
public class HashSetTest
{
	public static void main(String args[])
	{
		IOStream o = new IOStream();
		TreeSet<Integer> ts = new TreeSet<Integer>(); // ArrayList와 비슷하다.
		HashSet<Integer> hs = new HashSet<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random r = new Random();
		// ts.size == 0
		// hs.size == 0
		for(int i=ts.size();i<6;i++)
		{
			int n1=r.nextInt(45)+1; 
			int n2=(int)(Math.random()*45)+1;
			ts.add(n1);
			hs.add(n2);
			list.add(n1);
		}
		o.print("TreeSet: ");
		ts.forEach(go->o.print(go+" ")); // Integer go[] = {n, n, n, n, n, n};
		o.print("\nArrayList: ");
		list.forEach(go->o.print(go+" ")); // Integer go[] = {n, n, n, n, n, n};
		o.print("\nHashSet: ");
		hs.forEach(go->o.print(go+" ")); // Integer go[] = {n, n, n, n, n, n};
		
		
	}
}
