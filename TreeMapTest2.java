package day23;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import TOOL.IOStream;
public class TreeMapTest2 
{
	public static void main(String args[])
	{
		TreeMap<Integer,String> tree = new TreeMap<Integer,String>();
		String names[] = {"Jordan", "Marshal", "Angus", "Punchy", "Raymond"};
		int ages[] = {21,26,28,25,27}; 
		ArrayList<String> nList = new ArrayList<String>();
		ArrayList<Integer> aList = new ArrayList<Integer>();
		IOStream o = new IOStream();
		for(int i=0;i<names.length;i++)
		{			
			nList.add(names[i]);
			aList.add(ages[i]);
		}			
			for(int i=0;i<names.length;i++)
				tree.put(aList.get(i), nList.get(i));
			Set<Integer> keyset=tree.keySet();
			Iterator<Integer> it = keyset.iterator();
			while(it.hasNext())
			{
				Integer age=it.next();
				String name=tree.get(age);
				o.println(age+", "+name);
			}
		}
}
