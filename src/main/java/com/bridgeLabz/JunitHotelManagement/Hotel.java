package com.bridgeLabz.JunitHotelManagement;

import java.util.Date;

public class Hotel {
	
	private String Name;
	private Employee Emp;
	private Date date;
	private String Customer;
	private double Rates;
	
	public Hotel(String Name,String Customer,double Rates,Date date) {
		
		this.Name = Name;
		this.Customer = Customer;
		this.Rates = Rates;
		this.date = date;
	}
	
	public Hotel(String Name,Employee Emp) {
		this.Name = Name;
		this.Emp = Emp;
		
	}
	
	public Date getDate() {
		return date;
	}
	public double getRates() {
		return Rates;
	}
	public String getName() {
		return Name;
	}
}
