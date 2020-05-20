/**
 * @author TrongTran
 *
 */
package com.oneweekjava; 

import java.lang.Math.*;

public class Circle {
	
	private double radius;
	public String color;
	int testsamepackage;
	
	public Circle(){
		radius = 1.0;
		color = "Red";
	}
	
	public Circle(double r){
		radius = r;
		color = "Green";
	}
	
	public double getRadius(){
		return radius;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setRadius(double r){
		radius = r;
	}
	public void setColor(String color){
		this.color = color;
	}
	
	public double getArea(){
		return radius * radius * Math.PI;
	}

	public String toString(){
		return "Circle[radius= " + radius + ", color= " + color + "]"; 
	}
}
