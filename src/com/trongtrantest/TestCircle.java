package com.trongtrantest;

import com.oneweekjava.Circle;

public class TestCircle {
	
	public static final int NCIRCLEARR = 10;
	
	public static Circle[] circleArr = new Circle[NCIRCLEARR];
	
	
	public static void main(String[] args) {

		for (int i=0; i<NCIRCLEARR; i++){
			if ( i % 2 == 0) circleArr[i] = new Circle(i*1.0);
			else {
				circleArr[i] = new Circle();
				circleArr[i].color = "Yellow";
				
				// the line below is incorrect, property radius is private 
				//circleArr[i].radius = 1.0;
			}
			
		}
		
		for (int i=0; i<NCIRCLEARR; i++){
			if ( i % 2 == 0){
				System.out.println( i+1 +" "+ circleArr[i].toString() 
						+  "		area: " + Math.round(circleArr[i].getArea()*100)*1.0/100);	
			}else {	
				System.out.println( i+1 +" "+ circleArr[i].toString() 
						+  "		area: " + Math.round(circleArr[i].getArea()*100)/100.0);		
			}
				
		}
	}
}