package com.bridgeLabz.JunitHotelManagement;

import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class HotelManagement {

	
	private List<Hotel> Hotels; 
	
	public HotelManagement() {
		Hotels = new LinkedList<Hotel>();
	}
	
	public void addHotel() throws Exception {
		Hotel hotel1 = new Hotel("Moody Moon", "Regular", 250, DateClass.StringToDate("10Sep2018")); 
		Hotels.add(hotel1);
		Hotel hotel2 = new Hotel("Mandarin Oriental", "Regular", 200, DateClass.StringToDate("10Sep2018")); 
		Hotels.add(hotel2);
		Hotel hotel3 = new Hotel("Four Seasons", "Regular", 150, DateClass.StringToDate("10Sep2018")); 
		Hotels.add(hotel3);
		Hotel hotel4 = new Hotel("Knights Inn", "Regular", 150, DateClass.StringToDate("10Sep2018")); 
		Hotels.add(hotel4);
		Hotel hotel5 = new Hotel("Radisson", "Regular", 210, DateClass.StringToDate("10Sep2018")); 
		Hotels.add(hotel5);
		Hotel hotel6 = new Hotel("Classio","Regular",240,DateClass.StringToDate("10Sep2018")); 
		Hotels.add(hotel6);
		Hotel hotel7 = new Hotel("The Bay Club","Regular",2500,DateClass.StringToDate("10Sep2018")); 
		Hotels.add(hotel7);
	}
	
	public void CheapestHotel(HotelManagement hm, Date Start_date, Date End_date) throws Exception {
		
		TreeMap<Double, List<Hotel>> hotelMap = hm.Hotels.stream().
				filter(h->h.getDate().compareTo(Start_date)>=0 && h.getDate().compareTo(End_date)<=0).
				collect(Collectors.toList()).stream().collect(Collectors.groupingBy(Hotel::getRates , TreeMap::new, Collectors.toList()));
		 
		hotelMap.firstEntry().getValue().forEach(hotels->System.out.println(hotels.getName()+", "+hotels.getRates()));
		
		
	}
	 
	
	
}
