package com.oneweekjava;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		System.out.println("The circle has radius of " 
		         + c1.getRadius() + " and area of " + Math.round(c1.getArea()*100)/100.0);
		
		Circle c2 = new Circle(2.0);
		
		System.out.println("The circle has radius of " 
		         + c2.getRadius() + " and area of " + Math.round(c2.getArea()*100)*1.0/100 );	
		}

}
