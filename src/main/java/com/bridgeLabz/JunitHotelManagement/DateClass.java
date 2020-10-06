package com.bridgeLabz.JunitHotelManagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateClass {
	
	public static Date StringToDate(String date_string) throws Exception{
		DateFormat originalFormat = new SimpleDateFormat("ddMMMyyyy", Locale.ENGLISH);
		Date date = originalFormat.parse(date_string);
		return date;
	}
	
	public static String DateToString(Date dateToString) throws Exception {
		DateFormat targetFormat = new SimpleDateFormat("ddMMMyyyy",Locale.ENGLISH);
		String date = targetFormat.format(dateToString);
		return date;
		
	}
		
}
