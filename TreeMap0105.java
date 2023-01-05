package day24;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import TOOL.IOStream;
public class TreeMap0105 
{
	public static void main(String args[])
	{
		// NavigableSet.descendingKeySet()
		TreeMap<Integer, String> tree = new TreeMap<Integer, String>();
		Set<Integer> key;
		Iterator<Integer> it;
		Map.Entry<Integer, String> lowest;
		Map.Entry<Integer, String> highest;
		IOStream o = new IOStream();
		tree.put(98, "Raymond");
		tree.put(94, "Marshal");
		tree.put(75, "Punchy");
		tree.put(85, "Isabelle");
		key=tree.keySet();
		it=key.iterator();
		while(it.hasNext())
		{
			Integer scores=it.next();
			String names=tree.get(scores);
			o.println(scores+" | "+names);
		}
		lowest=tree.firstEntry(); // 가장 낮은 점수
		highest=tree.lastEntry(); // 가장 높은 점수
		o.println("Lowest score of the values: "+lowest.getKey());
		o.println("Highest score of the values: "+highest.getKey());
		// 점수별 오름차순 정렬
		o.println(o.ln);
	}
}
class Data
{
	int score; String name;
	public Data(int score, String name) 
	{
		super();
		this.score = score;
		this.name = name;
	}
	public Data() {}
}
