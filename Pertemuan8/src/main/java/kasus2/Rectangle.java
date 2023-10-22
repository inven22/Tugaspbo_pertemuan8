/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasus2;

/**
 *
 * @author ahmad al fajri
 */
public class Rectangle extends shape{
	private double length;
	private double width;
	
	public Rectangle(double l, double w) {
		super("Rectangle");
		this.length = l;
		this.width = w;
	}
	
	@Override
	public double area() {
		return this.width*this.length;
	}
	public String toString() {
		return super.toString() + " of length " + this.length + " and of width " + this.width;
	}
}

