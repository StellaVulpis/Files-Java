package day11;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Date_ 
{
	public static void main(String args[])
	{
		String underLine="\n---------------------------------------\n";
		Date date = new Date();
		SimpleDateFormat simD = new SimpleDateFormat("MMMM dd일, YYYY년 HH시 mm분");
		LocalDateTime NOW = LocalDateTime.now();
		Calendar cl = Calendar.getInstance(); // abstract class
		String crT = NOW.format(DateTimeFormatter.ofPattern("h시 mm분"));
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DATE);
		int hour = calendar.get(Calendar.HOUR);
		int min = calendar.get(Calendar.MINUTE);
		int hour_int = hour; double hour_min=(double)min;
		double timeCalc=0;double leftH=0, leftM=0;
		System.out.println("Today(Formatted): "+simD.format(date)+underLine);
		System.out.println("Today: "+NOW+underLine);
		System.out.println("Current Time: "+crT);
		leftH=(timeCalc*10)/6;
		hour_int+=12;hour_min/=100;
		timeCalc=((double)hour_int+(double)hour_min);
		System.out.printf("Left time: %.2f시간",timeCalc);
	}
}