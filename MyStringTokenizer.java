package day20;
import java.util.StringTokenizer;
import TOOL.IOStream;
public class MyStringTokenizer 
{
	String t; String token;
	MyStringTokenizer(String t, String token)
	{
		super();
		this.t=t;
		this.token=token;
	}
	public int countTokens() // My version of countTokens() (2022-12-30)
	{
		int count=0;
		String chars[] = new String[t.length()];
		for(int i=0;i<t.length();i++)
			chars[i]=t.substring(i,i+1); // String: substring(n, n); | char: charAt(n)
		for(int i=0;i<t.length();i++)
		{
			if(chars[i].equals(token))
				count++;
		}
		return count;
	}
	public static void main(String args[])
	{
		IOStream io = new IOStream();
		String line = "나 보기가 역@겨워 /가실 때에@는 말없이/ 고이 보@내@드리오리다.";
		StringTokenizer st1 = new StringTokenizer(line, "/"); // (대상 문자열 변수, 찾을 문자(토큰)) | StringTokenizer: 문자열을 분리해서 조작하게 해주는 클래스
		StringTokenizer st2 = new StringTokenizer(line, " "); // Parameter: String, String
		StringTokenizer st3 = new StringTokenizer(line, "@");
		MyStringTokenizer mt1 = new MyStringTokenizer(line, "@"); // Parameter: String, char
		MyStringTokenizer mt2 = new MyStringTokenizer(line, " ");
		MyStringTokenizer mt3 = new MyStringTokenizer(line, "/");
		int n1=st1.countTokens()-1;
		int n2=st2.countTokens()-1;
		int n3=st3.countTokens()-1;
		io.println("<Result of method countTokens()>");
		io.println("/ 토큰의 수: "+n1+"\n' '토큰의 수: "+n2+"\n@ 토큰의 수: "+n3);
		io.println("\n<Result of my countTokens()>\n@ 토큰의 수: "+mt1.countTokens());
		io.println("' ' 토큰의 수: "+mt2.countTokens());
		io.println("/ 토큰의 수: "+mt3.countTokens());
	}
}
