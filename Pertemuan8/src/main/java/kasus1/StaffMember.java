/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasus1;

/**
 *
 * @author ahmad al fajri
 */
public abstract class StaffMember {
    protected String name;
	protected String address;
	protected String phone;
	
	public StaffMember(String eName, String eAddress, String ePhone) {
		name = eName;
		address = eAddress;
		phone = ePhone;
	}
	
	public String toString() {
		String result = "Name : " + name + "\n";
		result += "Address : " + address + "\n";
		result += "Phone : " + phone + "\n";
		return result;
	}
	
	public abstract double pay();
}
