package Miscellaneous;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BOT 
{
	public static void main(String args[]) throws ParseException
	{
		String oldDate = "2019-05-10";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d =new Date();
		Calendar cal=Calendar.getInstance();
		cal.setTime(sdf.parse(oldDate));
		cal.add(Calendar.DATE, +30);
		System.out.println(cal.get(Calendar.DATE)); //10
		Date dateBeforeDays = cal.getTime(); //Fri May 10 17:41:39 IST 2019
		System.out.println(dateBeforeDays);
		System.out.println(sdf.format(dateBeforeDays)); // 2019-05-10
	}
}
