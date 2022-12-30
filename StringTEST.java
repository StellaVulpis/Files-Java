package day20;
import TOOL.*;
public class StringTEST 
{
	public static void main(String[] args) 
	{
		IOStream io = new IOStream();
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();
		String aa="Forest";
		String text="iloveyou.";
		String le = "letter";
		String star="★";
		Boolean isText;
		int test=0;
		String tt;
		String t1="nn "; String t2 = "ddd";
		
		
		io.print(aa);
		io.print("입력: ");
		tt=io.scanf("");
		io.print("입력: ");
		test=io.scanf(0);
		io.println("결과: "+tt);
		io.println("결과: "+test);
		io.print("Hashcode: ");
		io.println(aa.hashCode()+"\n");
		
		
		aa=aa.concat("Gump"); // concat: 문자 연결
		aa=aa.repeat(5); // 5번 반복
		aa=aa.replace('F', 'G'); // 문자열의 특정 문자를 교체 (교체대상, 교체할 문자)
		aa=aa.replace('F', '1');
		aa=aa.replace("Gorest", "Artic ");
		aa=aa.replace("Gump", "Fox \n");
		io.println(aa);
		io.println(text);
		text=text.replace("Il", "I l");
		text=text.replace("vey", "ve y");
		io.println(text);
		text=text.replace("love", "♥");
		io.println(text);
		text=text.replace("i", "I ");
		io.println(text);
		text=text.replace("♥", "love");
		io.println(text);
		le=le.toUpperCase();
		io.println(le);
		isText=le.contains("LE");
		io.println();
		if(isText == true)
			io.println(le+"에는 LE가 존재합니다.");
		else
			io.println(le+"에는 LE가 존재하지 않습니다.");
		sb.append("Howdy");
		io.println("address: "+sb+"\t-  "+sb.hashCode());
		sb.append(" Partner");
		io.println("address: "+sb+"\t-  "+sb.hashCode()); // 다른 문자열이지만 주소가 같다.
		sb1.append("Combining + ");
		sb1.append("words + ");
		sb1.append("together + ");
		sb1.append("to a + ");
		sb1.append("sentence.");
		io.println(""+sb1);
		io.print(star+" >> ");
		star=star.replace("★", "Star");
		io.println(star);
		io.print(sb+" >> ");
		sb.replace(0, 5, "Hello,"); // Substring과 규칙이 같다. 교체할 문자열의 시작과 끝을 지정하고 교체할 문자를 넣는다.
		io.print(""+sb);
	}

}
