package day23;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import TOOL.IOStream;
public class TreeMapTest
{
	public static void main(String args[])
	{
		TreeMap<Integer, String> tree = new TreeMap<Integer, String>();
		IOStream o = new IOStream();
		tree.put(1, "월요일");
		tree.put(2, "화요일");
		tree.put(3, "수요일");
		tree.put(4, "목요일");
		tree.put(5, "금요일");
		tree.put(6, "토요일");
		tree.put(7, "일요일");
		// 맵구조는 반드시 키값을 알아야 값을 출력
		// 1. 키만 모아서
		Set<Integer> keyset=tree.keySet(); 
		Iterator<Integer> it=keyset.iterator(); // 키 값을 순차적으로 정리, 표준화
		while(it.hasNext()) // 다음 값이 있을 때
		{
			Integer i=it.next();
			String day=tree.get(i);
			o.println(i+". "+day);
		}
	}
}
