/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasus2;

/**
 *
 * @author ahmad al fajri
 */
public class Paint {
    private double coverage ;
	public Paint(double c) {
		this.coverage = c;
	}
	
	public double amount(shape s) {
		System.out.println("Computing amount for " + s);
		return s.area();
	}
}
