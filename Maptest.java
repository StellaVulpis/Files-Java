package day24;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import TOOL.IOStream;

public class Maptest 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> tree = new TreeMap<Integer, String>();
		Set<Integer> keyset; 
		// keySet 메소드 앞에 올 수 있는 건 객체(class)
		Iterator<Integer> it; 
		IOStream o = new IOStream();
		tree.put(1,"Monday");
		tree.put(2,"Tuesday");
		tree.put(3,"Wednesday");
		tree.put(4,"Thursday");
		tree.put(5,"Friday");
		tree.put(6,"Saturday");
		tree.put(7,"Sunday");
		keyset=tree.keySet(); // >> K, V에서 K에 있는 키 값들을 가져온다.
		it=keyset.iterator(); // >> 키 값을 정렬
		o.println("Keyset: "+keyset+"\n"); // Key들의 집합 == keySet();
		while(it.hasNext()) // Boolean >> Asking if it has the next values.
		{
			Integer n=it.next();
			String t=tree.get(n);
			o.println(n+" "+t);
		}
		o.print(o.ln+"검색할 키 값을 입력: ");
		String s=o.scanf(null);
		Integer n=o.toInt(s);
		Boolean isKey=keyset.contains(n);
		if(isKey) // if(isKey==true)
		{
			o.println(o.ln+"\n찾았습니다.");
			o.println("키: "+n+" | 값: "+tree.get(n));
		}
		else
		{
			o.errln("키 값을 찾지 못했습니다.");
			o.exit();
		}
	}
}
