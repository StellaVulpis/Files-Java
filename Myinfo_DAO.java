package day12;
import java.util.ArrayList;
public class Myinfo_DAO // DAO: Data Access Object; 데이터에 접근하기 위한 동작이 담긴 객체
{
	ArrayList<Myinfo_DTO> list = new ArrayList<Myinfo_DTO>();
	Myinfo_Input in = new Myinfo_Input();
	
	public void insert()
	{
		Myinfo_DTO dat = new Myinfo_DTO();
		dat.setName(in.scanfStr("이름을 입력"));
		dat.setAge(in.scanfInt("나이를 입력"));
		dat.setContacts(in.scanfStr("전화번호를 입력"));
		list.add(dat);
	}
	public void out()
	{
		Myinfo_DTO dat = new Myinfo_DTO();
		
		System.out.println();
		System.out.print("이름\t");
		System.out.print("나이\t");
		System.out.println("전화번호\t");
		for(Myinfo_DTO a:list)
		{
			System.out.println(dat.underLine);
			System.out.print(a.getName()+"\t");
			System.out.print(a.getAge()+"\t");
			System.out.println(a.getContacts().substring(0,3)+"-"+a.getContacts().substring(3,7)+"-"+a.getContacts().substring(7,11));
		}
		System.out.println(dat.underLine);
	}
	public void delete()
	{
		Myinfo_DTO dat = new Myinfo_DTO();
		int po=-1; // Position
		String ans;
		System.out.println(dat.underLine+"Type a name to delete: ");
		String NtoDel = in.sc.next();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getName().equals(NtoDel)) // 내가 입력한 이름과 일치하면
			{
				po=i; // 삭제할 이름의 위치를 저장
				break;
			}
			System.out.println(dat.underLine+"\n\n");
		}
		if(po==-1)
		{
			System.out.println(NtoDel+"is not valid name.\n\n");
		}
		else // 삭제할 이름 발견
		{
			System.out.println(dat.underLine+"Name found, check below.");
			System.out.println("Name: "+list.get(po).getName());
			System.out.println("Age: "+list.get(po).getAge());
			System.out.println("Contact info: "+list.get(po).getContacts());
			System.out.println("Are you sure to delete these objects?\nIf you type yes, they will be completely removed.");
			ans=in.sc.next();
			if(ans.equals("YES")||ans.equals("Yes")||ans.equals("yes")
					||ans.equals("Y")||ans.equals("y"))
				list.remove(po);
			else
			{
				System.out.println("Program was terminated.");
				return;
			}
		}
	}
	public void run()
	{
		Myinfo_Input in = new Myinfo_Input();
		Myinfo_DTO dat = new Myinfo_DTO();
		while(true)
		{
			System.out.println("1. Input");
			System.out.println("2. Output");
			System.out.println("3. Delete");
			System.out.println("4. Exit");
			System.out.print("Select a menu: ");
			int n = in.sc.nextInt();
			switch(n)
			{
			case 1:
				insert();
				break;
			case 2:
				out();
				break;
			case 3:
				delete();
				break;
			case 4:
				System.exit(0);
			}
		}
	}
}
