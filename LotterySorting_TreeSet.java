package day24;

import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;

import TOOL.IOStream;

public class LotterySorting_TreeSet 
{
	public static void main(String args[])
	{
		// 로또 넘버를 1~100까지 생성해서 번호를 10개 생성 
		// Desc
		IOStream o = new IOStream();
		TreeSet<Integer> tList = new TreeSet<Integer>();
		NavigableSet<Integer> dcd = tList.descendingSet(); // 내림차 정렬
		NavigableSet<Integer> asd = dcd.descendingSet(); // >> tList의 로또 숫자를 내림차순으로 정렬 후 다시 정렬해서 오름차가된다.;
		NavigableSet<Integer> nCount1=tList.subSet(10, true, 19, true); // >> 1번째의 파라미터 부터 2번째의 파라미터 까지 
	                                                                                                   //    숫자가 존재하는지 확인 후 해당 값을 출력한
		NavigableSet<Integer> nCount2=tList.subSet(20, true, 29, true);
		NavigableSet<Integer> nCount3=tList.subSet(30, true, 39, true);
		NavigableSet<Integer> nCount4=tList.subSet(40, true, 49, true);
		Random r = new Random();
		int len=10;
		for(int i=tList.size();i<len;i++)
		{
			int lott=r.nextInt(100)+1;
			tList.add(lott);
		}
		// 출력
		o.println("[트리셋 목록들 내림차 정렬]");
		dcd.forEach(go->o.print(" "+go));
		o.print(o.ln);
		o.println("[트리셋 목록들 오름차 정렬]");
		asd.forEach(go->o.print(" "+go));
		o.print(o.ln);
		o.println("[트리셋 목록 번호 찾기]");
		o.println("10, 19: "+nCount1.size()+"개 | "+nCount1);
		o.println("20, 29: "+nCount1.size()+"개 | "+nCount2);
		o.println("30~39: "+nCount1.size()+"개 | "+nCount3);
		o.println("40~49: "+nCount1.size()+"개| "+nCount4);
	}
}
