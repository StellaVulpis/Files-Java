package day26;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ChoiceFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import TOOL.IOStream;
public class StreamDAO extends IOStream implements stream
{
	Boolean isLoaded;
	private StreamDAO()
	{
		isLoaded=false;
	}
	private static StreamDAO instance = new StreamDAO();
	public static StreamDAO getInstance()
	{
		return instance;
	}
	private static String 
	f="Soccer Club",
	b="Baseball Club",
	g="Gaming Club";
	enum names
	{
		f,b,g
	}
	ArrayList<StreamDTO> list = new ArrayList<StreamDTO>();
	ArrayList<StreamDTO> kSumList = new ArrayList<StreamDTO>();
	ArrayList<StreamDTO> sList = new ArrayList<StreamDTO>();
	StreamDTO dat=new StreamDTO();
	List<StreamDTO> li;
	List<StreamDTO> li2;
	TreeMap<String, String> map = new TreeMap<String, String>();
	Set<String> keys;
	Iterator<String> it;
	double scoreRank[] = new double[999];
	@Override
	public void load() 
	{
		/*
		 * A-ClassJordan 076084087g
			B-ClassMarshal093076091b
			A-ClassBrian  089068097f
			C-ClassJasper 091060081g
			D-ClassPunchy 083072089g
			C-ClassRaymond092096055b
			A-ClassFang   076087073f
			(0,7)(7,14)(14,17)(17,20)(20,23)(23,24)
		 * */
		try
		{
			FileReader f = new FileReader("C:/Data/streamTest.txt");
			BufferedReader bf = new BufferedReader(f);
			while(true)
			{
				StreamDTO dat=new StreamDTO();
				String txt = bf.readLine();
				String classNames, names, clubNames;
				int kor,eng,math, c=3;
				double total,avrg; 
				String grade;
				double limits[] = {0,60,70,80,90}; // must use double type on limits & sort them in ascending order.
				String grd[]= {"F","D","C","B","A"};
				ChoiceFormat cf = new ChoiceFormat(limits, grd);	
				// String pattern = "0#F|59<D|70#C|80#B|90#A";
				// int scores[] = {95,62,75,50,47};
				// ChoiceFormat form = new ChoiceFormat(pattern);
				if(txt==null)
				{
					bf.close();
					break;
				}
				classNames=txt.substring(0,7);
				names=txt.substring(7,14);
				classNames=classNames.trim();
				names=names.trim();
				kor=toInt(txt.substring(14,17));
				eng=toInt(txt.substring(17,20));
				math=toInt(txt.substring(20,23));
				total=((double)kor+(double)eng+(double)math);
				avrg=total/c;
				grade=cf.format(avrg);
				switch(txt.substring(23,24))
				{
				case"f":
					clubNames=StreamDAO.f;
					break;
				case"b":
					clubNames=StreamDAO.b;
					break;
				case"g":
					clubNames=StreamDAO.g;
					break;
				default:
					clubNames="";
					break;
				}// end of switch()
				dat.setNames(names);
				dat.setClassNames(classNames);
				dat.setKor(kor);
				dat.setEng(eng);
				dat.setMath(math);
				dat.setGrade(grade.charAt(0));
				dat.setTotal(total);
				dat.setAvrg(avrg);
				dat.setClubNames(clubNames);
				list.add(dat);
			}// end of while
			/*
			 * 중간 함수
			 * 1. When importing the values: mapTo (mapToInt(), mapToDouble()...)
			 * 2. filter(조건)
			 * 3. sorted(정렬)
			 */
			// Score sum just in Korean
			int korSum=list.stream().mapToInt(StreamDTO::getKor).sum();
			// Score sum just in English
			int engSum=list.stream().mapToInt(StreamDTO::getEng).sum();
			// Score sum just in Mathematics
			int mathSum=list.stream().mapToInt(StreamDTO::getMath).sum();
			// Number of loaded objects(list)
			long listCount=list.stream().count();
			long above70Kor=list.stream().filter(go->go.getKor()>=70).count();
			long above70Eng=list.stream().filter(go->go.getEng()>=70).count();
			long above70Math=list.stream().filter(go->go.getMath()>=70).count();
			long up70KorDown65EngUp85Math=list.stream().filter(go->go.getKor()>=70&&go.getMath()<=65&&go.getEng()>=85).count();
			dat.setKorSum(korSum); dat.setEngSum(engSum); dat.setMathSum(mathSum);
			dat.setListCount(listCount); 
			dat.setAbove70Kor(above70Kor); dat.setAbove70Eng(above70Eng); dat.setAbove70Math(above70Math);
			dat.setUp70KorDown65EngUp85Math(up70KorDown65EngUp85Math);
			for(int i=0;i<list.size();i++)
				map.put(list.get(i).getClassNames(), list.get(i).getNames());
			keys=map.keySet();
			it=keys.iterator();
			print(ln+"INFO: File was successfully loaded."+ln);
			isLoaded=true;
		}catch(IOException e)
		{
			err(ln+e.getMessage()+ln);
		}
	}
	@Override
	public void run() 
	{
		while(true)
		{
			print(ln+"1-Load file\n2-Print result\n3-Finish\n");
			print("Select a menu to run"+ln);
			print("Enter: ");
			String sel=scanf(null);
			switch(sel)
			{
			case "1":
			case "Load":
			case "load":
			case "Load file":
			case "load file":
				load();
				break;
			case "2":
			case "Print":
			case "print":
			case "Print result":
			case "print result":
				out();
				break;
			case "3":
			case "Finish":
			case "finish":
			case "Exit":
			case "exit":
			case "END":
			case "end":
				Exit();
				break;
			default:
				err(ln+"You've entered wrong number or text, please type accurate number / text from the menu."+ln);
				continue;
			}
		}
	}
	@Override
	public void out() 
	{
		if(isLoaded==false)
		{
			print(ln+"INFO: Since the data file wasn't loaded, System loaded it automatically."+ln);
			load();
		}
		Collections.sort(list);
		li /* List<StreamDTO> li */ =list.stream().sorted(Comparator.comparing(StreamDTO::getClassNames)).collect(Collectors.toList()); 
		li2=list.stream().sorted(Comparator.comparing(StreamDTO::getClassNames)).collect(Collectors.toList());
		print(ln+"[Result]"+ln);
		int count=1;
		for(StreamDTO a:list)
		{
			println("[Rank: "+(count++)+"]");
			print("\n"+a.toString()+ln);	
		}
		print("Total sum of scores in Korean: "+dat.korSum+" | English: "+dat.engSum+" | Mathematics: "+dat.mathSum+"\n");
		print("Number of loaded data: "+dat.listCount+ln);
		print("[Filter test]\n");
		print("Number of scores in Korean which is above 70: "+dat.above70Kor+"\n");
		print("Number of scores in English which is above 70: "+dat.above70Kor+"\n");
		print("Number of scores in Mathematics which is above 70: "+dat.above70Kor+"\n");
		print("Number of scores that is above 70 in Korean,\nbelow 65 in English, and above 85 in Mathematics: "+dat.up70KorDown65EngUp85Math);
		print(ln+ln+"[List in ascending order by Names]\n");
		li.forEach(go->println(go+"\n"));
		print(ln+ln+"[List in ascending order by Classes]\n");
		li2.forEach(go->println(go+ln+ln));
		print(ln+ln+"[Reverse order of list by names]\n\n");
		Collections.reverse(li); Collections.reverse(li2);
		li.forEach(go->println(go+"\n"));
		print(ln+ln+"[Reverse order of list by class names]\n\n");
		li2.forEach(go->println(go+"\n"));
		//==========================================================================================
				// Sum of scores in Korean by class name.
		print(ln+ln+"[Score sum in Korean by class names]"+ln);
				while(it.hasNext())
				{
					String Class=it.next();
					int korSumbyClassName=list.stream().filter(go->go.getClassNames().equals(Class)).mapToInt(StreamDTO::getKor).sum();
					print("Score sum: "+korSumbyClassName+" | Class name: "+Class+ln);
				}
				//==========================================================================================
	}
	@Override
	public void Exit() 
	{
		err(ln+"INFO: Program was successfully terminated."+ln);
		exit();
	}
}
interface stream
{
	public void load();
	public void out();
	public void Exit();
	public void run();
}
