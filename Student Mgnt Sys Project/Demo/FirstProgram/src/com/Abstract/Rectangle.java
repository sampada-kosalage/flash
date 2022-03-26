package com.Abstract;

public class Rectangle extends Shape implements Resizable{

	int width;
	int height;
	int c;
	
	@Override
	public int getArea(int width , int height) {
		c=width*height;
		System.out.println(c);
		return 0;
	}
	public void getPerimeter(int Side) {
    System.out.println("perimeter in rectangle");
    System.out.println(width);
    System.out.println(height);

	}
	public void resize(double x,double y) {
		System.out.println("resize area below");
		double z=x*y;
		System.out.println(z);
	}
	
		
	}

