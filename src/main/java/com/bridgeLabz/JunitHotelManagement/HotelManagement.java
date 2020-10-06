package com.bridgeLabz.JunitHotelManagement;

import java.util.LinkedList;
import java.util.List;

public class HotelManagement {

	
	private List<Hotel> Hotels; 
	
	public HotelManagement() {
		Hotels = new LinkedList<Hotel>();
	}
	
	public void addHotel() {
		Hotel hotel1 = new Hotel("Moody Moon","Regular",250); 
		Hotels.add(hotel1);
		Hotel hotel2 = new Hotel("Mandarin Oriental","Regular",250); 
		Hotels.add(hotel2);
		Hotel hotel3 = new Hotel("Four Seasons","Regular",250); 
		Hotels.add(hotel3);
		Hotel hotel4 = new Hotel("Knights Inn","Regular",250); 
		Hotels.add(hotel4);
		Hotel hotel5 = new Hotel("Radisson","Regular",250); 
		Hotels.add(hotel5);
		Hotel hotel6 = new Hotel("Classio","Regular",250); 
		Hotels.add(hotel6);
		Hotel hotel7 = new Hotel("The Bay Club","Regular",250); 
		Hotels.add(hotel7);
	}
	
}
