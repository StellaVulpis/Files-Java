package day20;

import TOOL.IOStream;

public class NameFinding 
{
	IOStream o = new IOStream();
	public static void main(String args[])
	{
		// 회원명단 5명 이름 저장
		// 외부에서 찾는 이름 입력
		IOStream o = new IOStream();
		NameFinding n = new NameFinding();
		int sel=0;
		o.println("메뉴 선택");
		o.println("1. 이름 찾기\n2. 이름 변경\n3. 종료");
		o.print("입력: ");
		sel=o.scInt();
		switch(sel)
		{
		case 1:
			n.find();
			break;
		case 2:
			n.search();
			break;
		case 3:
			o.exit();
	}
	}
	public void find()
	{
		String names[]= {"김철수","김광석","홍길동","조용필","노홍철"};
		String input="", name=""; int count=0, i=0;
		StringBuffer sb = new StringBuffer();
		Boolean isName=false;
		o.println();
		for(;;)
		{
			if(isName==true)
				break;
			o.print("이름을 입력: ");
			input=o.scLine();
			while(true)
			{
				if(input.equals(names[i]))
				{
					o.print(o.ln+"이름을 찾았습니다.\n"+o.ln);
					isName=input.contains(names[i]);
					name=names[i];
					break;
				}
				i++;
			}
		count++;
		}
		if(isName==true)
			o.print("\n\n"+o.ln+"당신이 입력한 이름은 ["+input+"] 이며, 찾은 이름은 ["+name+"] 입니다.");
		else
			o.errln("이름을 찾지 못했습니다.\n");
		o.err("종료합니다.");
	}
	public void search()
	{
		String names[]= {"Reo","Simpson","Fuji","Li","Kim"};
		String input="", altname="", name=""; int count=0, i=0, p=0;
		StringBuffer sb = new StringBuffer();
		Boolean isName=false;
		o.println();
		for(;;)
		{
			if(isName==true)
				break;
			o.print("이름을 입력: ");
			input=o.scLine();
			while(true)
			{
				if(input.equals(names[i]))
				{
					o.print(o.ln+"이름을 찾았습니다.\n찾은 이름: "+names[i]+o.ln);
					isName=input.contains(names[i]);
					name=names[i];
					o.print("바꿀 이름을 입력: ");
					altname=o.scLine();
					names[i]=altname; p=i;
					o.print(o.ln+"이름을 성공적으로 변경했습니다.\n");
					break;
				}
				i++;
			}
		count++;
		}
		if(isName==true)
			o.print("\n"+o.ln+"기존 이름은 ["+name+"] 이며, 변경한 이름은 ["+names[p]+"] 입니다.\n\n");
		else
			o.errln("이름을 찾지 못했습니다.\n");
		o.errln("종료합니다.");
	}
}
