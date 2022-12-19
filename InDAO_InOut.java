package day11;

import java.util.Scanner;
public class InDAO_InOut 
{
	InDAO_SetInfo in = new InDAO_SetInfo();
	String underLine;
	InDAO_InOut()
	{
		underLine="--------------------------------------------------------";
	}
	Scanner tc = new Scanner(System.in); // String
	Scanner sc = new Scanner(System.in); // Integer
	public String tcanStr(String text, Scanner tc)
	{
		System.out.print(text+": ");
		return tc.nextLine();
	}
	public int tcanInt(String text, Scanner tc)
	{
		System.out.print(text+": ");
		return tc.nextInt();
	}
	
	// 입력기능 
	public void in()
	{
		in.setName(tcanStr("Your name",tc));
		in.setAge(tcanInt("Your age",sc));
		in.setAdd_Si(tcanStr("Input address of the city you live",tc));
		in.setAdd_Gu(tcanStr("Input address of Gu you live",tc));
		in.setAdd_Dong(tcanStr("Input address of Dong you live",tc));
		in.setNum1(tcanStr("Type first digits of your phone number",tc));
		in.setNum2(tcanStr("Type second digits of your phone number",tc));
		in.setNum3(tcanStr("Type third digits of your phone number",tc));
	}
	// 출력기능
	public void out()
	{
		System.out.println(underLine);
		System.out.println("Your name: "+in.name);
		System.out.println("Your age: "+in.age);
		System.out.printf("Your phone number: %s-%s-%s\n",in.number.get(0),in.number.get(1),in.number.get(2));
		System.out.printf("Your address: %s-Dong, %s-Gu, %s-Si, Korea, Republic of\n",in.dong,in.gu,in.si);
		System.out.println(underLine);
	}
	// Print output with ArrayList and returned values(get~).
}