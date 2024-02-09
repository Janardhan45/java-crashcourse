package java_course;

import java.util.Scanner;

class Shape {

 public double calculateArea() {
     return 0;
 }

 public double calculatePerimeter() {
     return 0;
 }
}


class Circle extends Shape {
 private double radius;


 public Circle(double radius) {
     this.radius = radius;
 }


 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }

 @Override
 public double calculatePerimeter() {
     return 2 * Math.PI * radius;
 }
}


class Rectangle extends Shape {
 private double width;
 private double height;

 public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 @Override
 public double calculateArea() {
     return width * height;
 }

 @Override
 public double calculatePerimeter() {
     return 2 * (width + height);
 }
}

public class ShapesHierarchy {
 public static void main(String[] args) {
	 
	 Scanner sc= new Scanner(System.in);
     Circle circle = new Circle(5);
     Rectangle rectangle = new Rectangle(4, 6);


     System.out.println("Circle :");
     System.out.println("Area: " + circle.calculateArea());
     System.out.println("Perimeter: " + circle.calculatePerimeter());

     System.out.println("\nRectangle:");
     System.out.println("Area: " + rectangle.calculateArea());
     System.out.println("Perimeter: " + rectangle.calculatePerimeter());
 }
}
