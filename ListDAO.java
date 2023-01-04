package day23;
import java.util.ArrayList;
import java.util.Iterator;
import TOOL.*;
public class ListDAO extends IOStream implements DataInputs
{
	ArrayList<ListDTO> list = new ArrayList<ListDTO>();

	@Override
	public void in() 
	{
		String input[][] = 
			{
						{"Marshal", "4096, California", "26"},
						{"Isaac", "502, South Carolina", "20"},
						{"Isabelle","204, AnimaIsle","27"},
						{"Raymond","201, AnimaIsle","26"}
			};
		ListDTO dat;
	//	list.forEach(go->println(go+" "));
		for(int a=0;a<input.length;a++)
		{
				dat  = new ListDTO(input[a][0]+" | ", input[a][1]+" | ", input[a][2]);
				list.add(dat);
			println();
		}

	}
	@Override
	public void out() 
	{
		Iterator<ListDTO> it = list.iterator();
		ListDTO dat;
		println("[ArrayList forEach()]\n");
		list.forEach(go->println(" "+ go));
		print(ln);
		println("\n[DTO toString()]\n");
		for(int i=0;i<list.size();i++)
		{
			dat=list.get(i);
			println(dat.toString());
		}
		print(ln);
		println("\n[Iterator next()]\n");
		while(it.hasNext()) //ConCurrentModificationException: It occurrs when executing methods without directly using it. (Like running methods in another method.)
		{
			ListDTO d = new ListDTO();
			d=it.next();
			println(d.toString());
		}
	}
	@Override
	public void menu() 
	{
		
	}
	
}
