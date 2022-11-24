package com.fragile.oop;

abstract class ShapeAbstraction {
    String color;
    abstract double area();
    abstract public String toString();
    public ShapeAbstraction(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
}

class Circle extends ShapeAbstraction{
    final double pi = 3.142;
     double radius;
    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    @Override
    double area() {
        return  pi * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "the color of is " + getColor() + " and the area is " + area() ;
    }
}

class Rectangle extends  ShapeAbstraction{
    double length; double breath;

    public Rectangle(String color , double length, double breath){
        super(color);
        this.length = length;
        this.breath = breath;
    }

    @Override
    double area() {
        return length *  breath;
    }

    @Override
    public String toString() {
        return "Rectangle{" + " the color is " + getColor() +
                ", length=" + length +
                ", breath=" + breath + ", and area = " +  area() +
                '}';
    }
}

