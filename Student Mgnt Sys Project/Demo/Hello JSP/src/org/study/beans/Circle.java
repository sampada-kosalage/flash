package org.study.beans;

public class Circle {

	double radius;
    double area;
    public void setRadius(double r) {
        radius = r;
     }

     public double getRadius(){
        return radius;
     }

     public double getArea(){
        return 3.14*radius*radius;
     }
}
