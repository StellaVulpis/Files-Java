package day15;


public class TotalScore 
{
	public static void main(String args[])
	{
		ScoreDAO1223 d = new ScoreDAO1223();
		d.menu();
	}
}

interface SCAN
{
	public int scInt(String text);
	public String scStr(String text);
}
interface funcs
{
	final String ln="\n------------------------------------------------------------------\n";
	public void In();
	public void Out();
	public void Search();
	public void Delete();
	public void Edit();
	public void Exit();
	public void Remove();
}