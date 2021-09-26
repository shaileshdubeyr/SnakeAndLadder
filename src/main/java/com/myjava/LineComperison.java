package com.myjava;

public class LineComperison {
	public static void main(String[] args) {
		System.out.println("Welcome to the line compersion computation");
		int x1 = (int)(Math.random() * 9);
		int x2 = (int)(Math.random() * 9);
		int y1 = (int)(Math.random() * 9);
		int y2 = (int)(Math.random() * 9);
		System.out.printf("the x1 %d and x2 %d and y1 %d y2 %d \n",x1,x2,y1,y2);
		double length = (float)Math.sqrt( ( (x2-x1) ^2 ) + ( (y2-y1) ^2) );
		System.out.printf("the length is %.2f \n",length);
	}

}
