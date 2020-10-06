package com.bridgeLabz.JunitHotelManagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Calendar;

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
	
	public static void main(String[] args) throws Exception {
		DateFormat format2=new SimpleDateFormat("EEEE");
		String Date = format2.format(DateClass.StringToDate("10Sep2018"));
		System.out.println(Date);
	}
}
