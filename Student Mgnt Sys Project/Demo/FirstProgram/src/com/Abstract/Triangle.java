package com.Abstract;

public class Triangle extends Shape{

	int a;
	int b;
	
	int d;
	
	public int getArea(int Side) {
		d=a*b;
		System.out.println(d);
		return 0;
	}

	public void getPerimeter(int a,int b) {
    System.out.println("Get perimeter in triangle");	
    System.out.println(a);
    System.out.println(b);

	}

	
	
 
}
