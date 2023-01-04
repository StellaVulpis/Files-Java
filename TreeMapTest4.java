package day23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import TOOL.IOStream;

public class TreeMapTest4
{
	public static void main(String args[])
	{
		ArrayList<ListDTO> list = new ArrayList<ListDTO>();
		TreeMap<Integer,String> tree1 = new TreeMap<Integer,String>();
		TreeMap<String,String> tree2 = new TreeMap<String,String>();
		IOStream o=new IOStream();

		
		try
		{
			/*
			 * 28Raymond 0277, AnimaIsleApple
				26Marshal 4031, StoneIsleGrape
				27Punchy  0269, AnimaIslePeach
				29Isabelle0268, AnimaIsleMelon   (0,2),(2,10),(10,25),(25,30)
			 * */
			FileReader f = new FileReader("C:/Data/23-01-04.txt");
			BufferedReader bf = new BufferedReader(f);
			while(true)
			{
				ListDTO dat = new ListDTO();
				String txt=bf.readLine();
				String name, address, fruit; int age;
				if(txt==null)
					break;
				age=o.toInt(txt.substring(0,2));
				name=txt.substring(2,10);
				address=txt.substring(10,25);
				fruit=txt.substring(25,30);		
				dat.setName(name); dat.setAddress(address); dat.setAge(age); dat.setFavFruit(fruit);
				list.add(dat);
			}
		} catch(IOException e)
		{
			e.printStackTrace();
		}// end of catch
		for(int i=0;i<list.size();i++)
		{
			tree1.put(list.get(i).getAge(), list.get(i).getName());
			tree2.put(list.get(i).getAddress(), list.get(i).getFavFruit());
		}
		Set<Integer> key1=tree1.keySet();
		Iterator<Integer> it=key1.iterator();
		Set<String> key2=tree2.keySet();
		Iterator<String> it2=key2.iterator();
		while(it.hasNext())
		{
			Integer age=it.next();
			String name=tree1.get(age);
			String address=it2.next();
			String favFruit=tree2.get(address);
			o.println("이름: "+name+"  |  나이: "+age+"  | 주소: "+address+"  |  좋아하는 과일: "+favFruit);
		}
	}
}
