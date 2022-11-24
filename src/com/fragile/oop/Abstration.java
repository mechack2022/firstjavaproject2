package com.fragile.oop;

public class Abstration {

    public static void main(String[] args){
        Circle circle = new Circle("red", 22);
        Rectangle rectangle = new Rectangle("yellow", 34, 12);
        System.out.println( circle.toString());
        System.out.println( rectangle.toString());

    }
}
