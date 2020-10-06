package com.bridgeLabz.JunitHotelManagement;

import java.util.Date;

public class Hotel {
	
	private String Name;
	private Employee Emp;
	private String Customer;
	private double Rates;
	
	public Hotel(String Name,String Customer,double Rates) {
		
		this.Name = Name;
		this.Customer = Customer;
		this.Rates = Rates;
	}
	
	public Hotel(String Name,Employee Emp) {
		this.Name = Name;
		this.Emp = Emp;
		
	}
}
