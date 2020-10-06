package com.bridgeLabz.JunitHotelManagement;

import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

interface Command 
{
    void invoke();
}

public class HotelManagement {

	
	private List<Hotel> Hotels; 
	private static Map<String, Command> commands = new HashMap<String, Command>();
	
	public HotelManagement() {
		Hotels = new LinkedList<Hotel>();
	}
	
	public void addHotel() throws Exception {
		Hotel hotel1 = new Hotel("Moody Moon", "Regular", 250, 210, DateClass.StringToDate("10Sep2018")); 
		Hotels.add(hotel1);
		Hotel hotel2 = new Hotel("Mandarin Oriental", "Regular", 200, 100, DateClass.StringToDate("10Sep2018")); 
		Hotels.add(hotel2);
		Hotel hotel3 = new Hotel("Four Seasons", "Regular", 150,140, DateClass.StringToDate("10Sep2018")); 
		Hotels.add(hotel3);
		Hotel hotel4 = new Hotel("Knights Inn", "Regular", 250,120, DateClass.StringToDate("10Sep2018")); 
		Hotels.add(hotel4);
		Hotel hotel5 = new Hotel("Radisson", "Regular", 210,100, DateClass.StringToDate("10Sep2018")); 
		Hotels.add(hotel5);
		Hotel hotel6 = new Hotel("Classio","Regular",240,120,DateClass.StringToDate("10Sep2018")); 
		Hotels.add(hotel6);
		Hotel hotel7 = new Hotel("The Bay Club","Regular",2500,2000,DateClass.StringToDate("10Sep2018")); 
		Hotels.add(hotel7);
	}
	
	public void CheapestHotel(HotelManagement hm, Date date) throws Exception {
		
		TreeMap<Double, List<Hotel>> hotelMap = hm.Hotels.stream().
				filter(h->h.getDate().compareTo(date)==0 ).
				collect(Collectors.toList()).stream().collect(Collectors.groupingBy(Hotel::getRates , TreeMap::new, Collectors.toList()));
		 
		double cheap_sum = hotelMap.firstEntry().getValue().stream().mapToDouble(Hotel::getRates).sum();
		
		
	}
	

	
	
	public static void CommandMapping(HotelManagement hm,Date date) {
		
		commands.put("Week-days", new Command() 
		{
		    public void invoke() { 
		    	TreeMap<Double, List<Hotel>> hotelMap = hm.Hotels.stream().
						filter(h->h.getDate().compareTo(date)==0 ).
						collect(Collectors.toList()).stream().collect(Collectors.groupingBy(Hotel::getRates , TreeMap::new, Collectors.toList()));
				 
				double cheap_sum = hotelMap.firstEntry().getValue().stream().mapToDouble(Hotel::getRates).sum(); }
		});
		
		commands.put("Weekend", new Command() 
		{
		    public void invoke() { 
		    	TreeMap<Double, List<Hotel>> hotelMap = hm.Hotels.stream().
						filter(h->h.getDate().compareTo(date)==0 ).
						collect(Collectors.toList()).stream().collect(Collectors.groupingBy(Hotel::getWeekend_Rates , TreeMap::new, Collectors.toList()));
				 
				double cheap_sum = hotelMap.firstEntry().getValue().stream().mapToDouble(Hotel::getRates).sum(); } 
		});
		
		
	}
	
	
	 
	
	
}
