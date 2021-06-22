package Miscellaneous;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {

	public static void main(String[] args) throws ParseException 
	{
		String d="7/9/19";
		//System.out.println(new SimpleDateFormat("yyyy-MM-dd").format("7/9/19"));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.format(d);


	}

}
