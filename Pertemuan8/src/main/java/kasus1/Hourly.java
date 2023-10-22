/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasus1;

/**
 *
 * @author ahmad al fajri
 */
public class Hourly extends Employee {
	private int hoursWorked;
	
	public Hourly(String eName, String eAddress, String ePhone,
			String socSecNumber, double rate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		
		hoursWorked = 0;
	}
	
	
	public void addHours(int moreHours) {
		hoursWorked += moreHours;
	}
	
	
	public double pay() {
            int payRate = 0;
		double payment = payRate * hoursWorked;
		hoursWorked = 0;
		
		return payment;
	}
	
	
	public String toString() {
		String result = super.toString();
		result += "\nCurrent hours: " + hoursWorked;
		
		return result;
}
}
