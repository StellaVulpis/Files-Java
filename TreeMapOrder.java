package day24;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;
import TOOL.IOStream;
public class TreeMapOrder 
{
	public static void main(String[] args) 
	{
		/*
		 * DTO 클래스에 이름,국어,영어,수학 총점 >> 객체 생성
		 * TreeMap 구조에서 총점, 이름 (총점==키, 이름==값)
		 * 총점을 내림차순 >> 오름차순 출력
		 * */
		TMORun run = new TMORun();
		Thread th=new Thread(run);
			th.start();
	}
}
class TMORun extends IOStream implements acts, Runnable
{
	TMOdata dat=new TMOdata();
	ArrayList<TMOdata> list = new ArrayList<TMOdata>();
	TreeMap<Integer, String> map=new TreeMap<Integer, String>();
	Map.Entry<Integer, String> low;
	Map.Entry<Integer, String> high;
	int LENGTH; Boolean isLoad;
	public TMORun()
	{
		isLoad=false;
	}
	@Override
	public void load() 
	{

			try
			{
				/*Jordan  079085065
					Marshal 095089100
					Isabelle088075098
					Raymond 098089055
					Conan   100075081
					Punchy  076100073
					(0,8)(8,11)(11,14)(14,17)
					*/
				FileReader f=new FileReader("C:/Data/TMO.txt");
				BufferedReader bf=new BufferedReader(f);
				while(true)
				{
					TMOdata dat = new TMOdata();
					String name; int kor, eng, math; int tot, avrg;
					String line = bf.readLine();
					if(line==null)
					{
						bf.close();
						break;
					}
					name=line.substring(0,8);
					kor=toInt(line.substring(8,11));
					eng=toInt(line.substring(11,14));
					math=toInt(line.substring(14,17));
					tot=kor+eng+math;
					avrg=tot/3;
					dat.setName(name);
					dat.setKor(kor);
					dat.setEng(eng);
					dat.setMath(math);
					dat.setTot(tot);
					dat.setAvrg(avrg);
					list.add(dat);
					setLength(1);
					map.put(avrg, name);
				}
				high=map.lastEntry();
				dat.setHighName(map.lastEntry().getValue());
				low=map.firstEntry();
				dat.setLowName(map.firstEntry().getValue());
			}catch(IOException e)
			{
				err(ln+"File couldn't be found or was no longer available, Try again."+ln);
				exit();
			}
			finally
			{
				print(ln+"File was loaded."+ln);
				isLoad=true;
			}
	}
	public int getLength()
	{
		return LENGTH;
	}
	public void setLength(int LENGTH)
	{
		this.LENGTH+=LENGTH;
	}
	@Override
	public void out() 
	{
		TreeSet<Integer> nList = new TreeSet<Integer>(); // <K 총점, V 이름>
		TreeSet<String> sList = new TreeSet<String>();
		NavigableSet<Integer> dcdN=nList.descendingSet();
		NavigableSet<Integer> acdN=dcdN.descendingSet();
		NavigableSet<String> dcdS=sList.descendingSet();
		NavigableSet<String> acdS=dcdS.descendingSet();
		for(int i=nList.size();i<LENGTH;i++)
		{
			int tot=list.get(i).getTot();
			String name=list.get(i).getName();
			nList.add(tot);
			sList.add(name);
			
		}
		print(ln+"[Result]"+ln);
		println("\n[TreeSet Descending]\n");
		dcdS.forEach(go->print("Name: "+go+"\n"));
		dcdN.forEach(go->print("Score total: "+go+"\n"));
		println("\n\n[TreeSet Ascending]\n");
		acdS.forEach(go->print("Name: "+go+"\n"));
		acdN.forEach(go->print("Score total: "+go+"\n"));
		print(ln+"[Scores, average]"+ln+"\n");
		for(int i=0;i<LENGTH;i++)
		{
			TMOdata dat=new TMOdata();
			dat=list.get(i);
			println("["+list.get(i).getName()+"]");
			println(dat.toString());
			print("\n");
		}
		print(ln+"\n");
		print(ln+"[Highest score, Lowest Score]"+ln+"\n");
		println("Lowest Score: "+low.getKey()+" | Name: "+dat.getLowName());
		println("Highest Score: "+high.getKey()+" | Name: "+dat.getHighName());
	}
	@Override
	public void run() 
	{
		while(true)
		{
			print(ln+"1. Load | 2. Print | 3. Finish"+ln);
			print("Enter: ");
			String sel=scanf(null);
			switch(sel)
			{
			case "1":
			case "Load":
				load();
				break;
			case "2":
			case "Print":
				if(isLoad==false)
				{
					err(ln+"You must load the data before you print it out."+ln);
					break;
				}
				else
					out();
				break;
			case "3":
			case "Finish":
				finish();
				break;
			}
		}
	}
	@Override
	public void finish() 
	{
		err(ln+"Program was successfully terminated.."+ln);
		exit();
	}
}
class TMOdata
{
	String name; int kor,eng,math,tot,avrg;
	String lowName, highName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public int getAvrg() {
		return avrg;
	}
	public void setAvrg(int avrg) {
		this.avrg = avrg;
	}
	@Override
	public String toString() 
	{
		return "Score in Korean: " + kor + " | Score in English: " + eng + " |  Score in Mathematics: " + math + "\n Score average: " + avrg;
	}
	public String getLowName() {
		return lowName;
	}
	public void setLowName(String lowName) {
		this.lowName = lowName;
	}
	public String getHighName() {
		return highName;
	}
	public void setHighName(String highName) {
		this.highName = highName;
	}
	
}
interface acts
{
	public void load();
	public void out();
	public void finish();
}