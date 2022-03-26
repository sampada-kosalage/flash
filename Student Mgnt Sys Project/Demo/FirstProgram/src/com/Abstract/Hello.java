package com.Abstract;

public class Hello {

	public static void main(String [] args) {
		Rectangle a=new Rectangle();
		a.getArea(20,30);
		a.getPerimeter(4,4);
		
		Shape a1=new Triangle();
		a1.getArea(4,20);
		a1.getPerimeter(20,20);
		
		Resizable R=new Rectangle();
		R.resize(6,2);
	}
}
