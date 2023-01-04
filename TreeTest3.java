package day23;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import TOOL.IOStream;
public class TreeTest3 
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
		Set<Integer> keyset=tree.keySet();
		Iterator<Integer> it=keyset.iterator();
		while(true)
		{
			
			o.println("1. 월요일\n2. 화요일\n3. 수요일\n4. 목요일\n5. 금요일\n6. 토요일\n7. 일요일"
					+ "\n8. 종료");
			o.print(o.ln+"찾을 날짜를 입력: ");
			String input=o.scanf(null);
			if(input.equals("종료") || input.equals("8"))
				break;
			int num=o.toInt(input.substring(0,1));
			String day=tree.get(num);
			o.print(o.ln+"날짜를 찾았습니다.\n\n");
			o.println(num+". "+day+o.ln);
		}
	}
}
