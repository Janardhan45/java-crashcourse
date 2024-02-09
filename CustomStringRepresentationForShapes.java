package java_course;
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
 public String toString() {
     return String.format("Circle with radius %.2f has an area of %.2f", radius, calculateArea());
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
 public String toString() {
     return String.format("Rectangle with length %.2f and width %.2f has an area of %.2f", width, height, calculateArea());
 }
}

public class CustomStringRepresentationForShapes {
 public static void main(String[] args) {
     Circle circle = new Circle(5);
     Rectangle rectangle = new Rectangle(5, 10);

     System.out.println(circle);
     System.out.println(rectangle);
 }
}
