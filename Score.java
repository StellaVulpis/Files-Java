package day13;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
class Score 
{
	public static void main(String args[]) throws FileNotFoundException, IOException 
	{
		ScoreDAO dao = new ScoreDAO();
		dao.run();
	}
	}

