package build02;

public class String_calc 
{
	public static void main(String[] args) 
	{
		String str1 = 2 + 3 + ""; // 2 + 3 + " " ==> 5""
		String str2 = 2 + "" + 3; // (2 + "") + 3 ==> "2" + 3 ==> "23" 
		String str3 = "10" + 2 + 3; // ("10" + 2) + 3 ==> "102" + 3 ==> "1023"
		//보는 바와 같이, 숫자에 ""문자열을 더하면 그 숫자는 문자열이 되버리고, 문자열인 숫자는 연산하지 않고 결합하게 된다.
 		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
