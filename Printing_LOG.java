package day03;
import java.util.logging.Logger;
import java.util.logging.Level;
public class Printing_LOG 
{
	// Must define it in class field.
	public static final Logger LOG = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static void main(String[] args) 
	{
		// Available logging types:
		// LOG.log(Level.INFO / ALL / CONFIG / FINE / FINER / OFF / SEVERE / WARNING
		LOG.log(Level.INFO, "Information to give for logging purpose");
	}

}
