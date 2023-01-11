package day28;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;
import TOOL.IOStream;
public class DAO extends IOStream implements methods
{
	ArrayList<DAT> list = new ArrayList<DAT>();
	private static DAO instance = new DAO();
	Boolean isLoaded, isSorted;
	private DAO() 
	{
		isLoaded=false;
		isSorted=false;
	}
	public static DAO getInstance()
	{
		return instance;
	}
	enum Names
	{
		a("A-Class"), 
		b("B-Class"), 
		c("C-Class"), 
		d("D-Class");
		private final String names;
		// private final int value (Use when there is integer value on enum variable initialization.)
		private Names(String names)
		{
			this.names=names;
			// this.value=value;
		}
		public String toString()
		{
			return names;
		}
	}
	@Override
	public void in()
	{
		// Names n1=Names.a; // >> Using enum values
		// String a=Names.a.name(); // >> Converting enum to String
		try
		{
			/*
			 *  Jordan 075099064a178420
				Marshal078096085c192555
				Raymond098096097d208841
				Jasper 085081098b179161
				Copper 075068091c212085
				Digby  100081094a190154
				TomNook079089100d181541
				Brian  097089100c175474
				(0,7)(7,10)(10,13)(13,16)(16,17)(17,23)
			 * */
			FileReader f = new FileReader("C:/Data/0111.txt");
			BufferedReader bf= new BufferedReader(f);
			while(true)
			{
				String name, className, id, adsDate, grade;
				Boolean isPass;
				int kor,eng,math; 
				double total, avrg;
				DAT dt = new DAT();
				String txt=bf.readLine();
				if(txt==null)
				{
					bf.close();
					break;
				}
				name=txt.substring(0,7);
				kor=toInt(txt.substring(7,10)); eng=toInt(txt.substring(10,13)); math=toInt(txt.substring(13,16));
				switch(txt.substring(16,17))
				{
				case "a":
					className=Names.a.name(); // Converting Enum type to String
					break;
				case "b":
					className=Names.b.name();
					break;
				case "c":
					className=Names.c.name();
					break;
				case "d":
					className=Names.d.name();
					break;
				default:
					className="NULL"; // Writing "NULL" to check whether the data is properly imported from file.
					break;
				}
				id=txt.substring(17,23);
				adsDate=txt.substring(17,19);
				total=(double)kor+(double)eng+(double)math;
				avrg=total/3; // len >> Length of the lines.
				switch((int)avrg/10)
				{
				case 10:
				case 9:
					grade="A";
					isPass=true;
					break;
				case 8:
					grade="B";
					isPass=true;
					break;
				case 7:
					grade="C";
					isPass=true;
					break;
				case 6: 
					grade="D";
					isPass=true;
					break;
				default:
					grade="F";
					isPass=false;
					break;
				}
				dt.setName(name);
				dt.setClassName(className);
				dt.setId(id);
				dt.setAdsDate(adsDate);
				dt.setGrade(grade);
				dt.setIsPass(isPass);
				dt.setKor(kor); dt.setEng(eng); dt.setMath(math);
				dt.setTotal(total); dt.setAvrg(avrg);
				list.add(dt);
			}// end of while(true)
			//=======================================
			isLoaded=true;
			print(ln+ln+"File was successfully loaded."+ln+ln);
		}catch(IOException e)
		{
			err(ln+e.getMessage()+ln);
		}
	}
	@Override
	public void out()
	{
		int rank=1;
		if(isLoaded==false)
		{
			print(ln+ln+"INFO: Since the file wasn't loaded, System loaded it automatically."+ln+ln);
			in();
		}
		for(DAT a:list)
		{
			print(ln+"[Rank: "+rank+"]");
			print(a.toString()+ln+ln);
			rank++;
		}
		println("INFO: Printing out the result is now completed.");
	}
	public void run()
	{
		while(true)
		{
			print(ln+"1. Load file\n2. Print out the result\n3. Sort the data in ascending order\n"
					+ "4. Sort the data in descending order\n5. Get sum by subject\n"
					+ "6. Count subject by specific condition\n7. Exit"+ln);
			print("Please select: "); 
			String sel=scanf(null);
				switch(sel)
				{
					case "1":
					case "Load":
					case "load":
					case "Load file":
						in();
						break;
					case "2":
					case "Print":
					case "print":
					case "Print out":
					case "Print out the result":
						out();
						break;
					case "3":
					case "Sort in ascending order":
					case "Sort the data in ascening order":
					case "Ascending":
					case "Ascending order":
					case "ascending":
					case "ascending order":
						sortAscend();
						break;
					case "4":
					case "Sort in descending order":
					case "Sort the data in descening order":
					case "Descending":
					case "Descending order":
					case "descending":
					case "descending order":
						sortDescend();
						break;
		//============================================================================================
					case "5":
					case "get sum":
					case "get sum by subject":
						print(ln+"Please select one among the subjects to get sum of score."+ln
								+ "1. Business Korean 408 | 2. Basic English 207 | 3. Mathematics 101 | 4. Return to menu"+ln);
						print("Enter: "); 
						sel=scanf(null);
						switch(sel)
						{
							case "1":
							case "Korean":
							case "korean":
							case "Business Korean 408":
								getSumKor();
								break;
							case "2":
							case "English":
							case "english":
							case " Basic English 207":
								getSumEng();
								break;
							case "3":
							case "Mathematics":
							case "math":
							case "Mathematics 101":
								getSumMath();
								break;
							case "4":
							case "Return":
							case "Return to menu":
							case "return":
								print(ln+"Returning to previous menu."+ln);
								break;
					}
				break;
	//==========================================================================================	
				case "6":
					print(ln+"Please select a option of subject to count."+ln
							+ "1. Count data that the score is above 290 or below 100 in total.\n"
							+ "2. Count data that the score is more than 200 and less than 300,\n"
							+ "and print it in ascending order."+ln);
					sel=scanf(null);
					switch(sel)
					{
					case "1":
						option_1();
						break;
					case "2":
						option_2();
						break;
					default:
						err(ln+"Please use only number."+ln);
						break;
					}
					break;
				case "7":
				case "exit":
				case "Exit":
				case "Finish":
				case "finish":
				case "end":
					end();
				default:
					err(ln+"You've entered wrong number or text, please try again.");
					continue;
				}
		}
	}
	@Override
	public void end()
	{
		err(ln+"Program was successfully terminated. Goodbye."+ln);
		exit();
	}
	@Override
	public void sortAscend()
	{
		if(isLoaded==false)
			in(); // Must import data to sort it.
		Collections.sort(list); // You must get inherited from the Comparable in DTO class first, and then
		// use Collections.sort(list); on DAO class. Collections and Comparable are connected with each other. 
		print(ln+"Sorting in ascending order is now completed,\nplease go back to menu and select Printing out option."+ln+ln);
		isSorted=true;
	}
	@Override
	public void sortDescend()
	{
		if(isLoaded==false)
			in();
		if(isSorted==false)
			Collections.sort(list);
		Collections.reverse(list);
		print(ln+"Sorting data in descending order is now completed,\nPlease go back to menu and select Printing out option."+ln+ln);
	}
	@Override
	public void getSumKor()
	{
		try
		{
			if(isLoaded==false)
			{
				println("File was loaded.");
				in();
			}
			print("Calculating, please wait");
			for(int i=0;i<5;i++)
			{
			print(".");
			Thread.sleep(800);
			}
			int korSum=list.stream().mapToInt(DAT::getKor).sum();
			print(ln+ln+"[Result]");
			print("\nThe sum of score in Business Korean is ["+korSum+"] .");
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	@Override
	public void getSumEng()
	{
		if(isLoaded==false)
			in();
		try
		{
			print("Calculating, please wait");
			for(int i=0;i<5;i++)
			{
			print(".");
			Thread.sleep(800);
			}
			int engSum=list.stream().mapToInt(DAT::getEng).sum();
			print(ln+ln+"[Result]");
			print("\nThe sum of score in Business Korean is ["+engSum+"] .");
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	@Override
	public void getSumMath()
	{
		if(isLoaded==false)
			in();
		try
		{
			print("Calculating, please wait");
			for(int i=0;i<5;i++)
			{
			print(".");
			Thread.sleep(800);
			}
			int mathSum=list.stream().mapToInt(DAT::getMath).sum();
			print(ln+ln+"[Result]");
			print("\nThe sum of score in Business Korean is ["+mathSum+"] .");
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public void option_1()
	{
		if(isLoaded==false)
			in();
		try
		{
			print("Calculating, please wait");
			for(int i=0;i<5;i++)
			{
			print(".");
			Thread.sleep(800);
			}
			// write here...
			// 총점이 100 이하이거나 290 이상인 자료의 건 수
			long opt1_countResult=list.stream().filter(go->go.getTotal()>=290 || go.getTotal()<=100).count();
			print(ln+ln+"[Result]");
			print("\nNumber of  data that is above 290 or below 100 is["+opt1_countResult+"] .");
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public void option_2()
	{
		if(isLoaded==false)
			in();
		try
		{
			print("Calculating, please wait");
			for(int i=0;i<5;i++)
			{
				print(".");
				Thread.sleep(800);
			}
			// write here...
			// 총점이 200점 대인 자료만 골라서 반, 번호 오름차순으로 정렬하여 출력
			Stream<DAT> opt2_countResult_A=list.stream().
					filter(go->go.getTotal()>=200&&go.getTotal()<300&&go.getClassName().
					equals("A-Class")).sorted(Comparator.comparing(DAT::getClassName).thenComparing(Comparator.comparing(DAT::getId)));
			Stream<DAT> opt2_countResult_B=list.stream().
					filter(go->go.getTotal()>=200&&go.getTotal()<300&&go.getClassName().
					equals("B-Class")).sorted(Comparator.comparing(DAT::getClassName).thenComparing(Comparator.comparing(DAT::getId)));
			Stream<DAT> opt2_countResult_C=list.stream().
					filter(go->go.getTotal()>=200&&go.getTotal()<300&&go.getClassName().
					equals("C-Class")).sorted(Comparator.comparing(DAT::getClassName).thenComparing(Comparator.comparing(DAT::getId)));
			Stream<DAT> opt2_countResult_D=list.stream().
					filter(go->go.getTotal()>=200&&go.getTotal()<300&&go.getClassName().
					equals("D-Class")).sorted(Comparator.comparing(DAT::getClassName).thenComparing(Comparator.comparing(DAT::getId)));
			print(ln+ln+"[Result]");
			print("\n[Printing A-Class in ascending order and score is above 200 and below 300]");
			opt2_countResult_A.forEach(go->println(go+"\n"));
			Thread.sleep(1000);
			print("\n[Printing B-Class in ascending order and score is above 200 and below 300]");
			opt2_countResult_B.forEach(go->println(go+"\n"));
			Thread.sleep(1000);
			print("\n[Printing C-Class in ascending order and score is above 200 and below 300]");
			opt2_countResult_C.forEach(go->println(go+"\n"));
			Thread.sleep(1000);
			print("\n[Printing D-Class in ascending order and score is above 200 and below 300]");
			opt2_countResult_D.forEach(go->println(go+"\n"));
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
interface methods
{
	public void in();
	public void out();
	public void sortAscend();
	public void sortDescend();
	public void getSumKor();
	public void getSumEng();
	public void getSumMath();
	public void option_1();
	public void option_2();
	public void end();
}