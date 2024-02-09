package java_course;

class shape {
    
    public void printCalculationMessage() {
        System.out.println("Calculating area...");
    }

    
    public double calculateArea() {
        return 0;
    }

    public double calculatePerimeter() {
        return 0;
    }
}


class cir extends shape {
    private double radius;

   
    public cir(double radius) {
        this.radius = radius;
    }

    
    @Override
    public double calculateArea() {
        super.printCalculationMessage(); 
        return Math.PI * radius * radius;
    }


    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}


class Rect extends shape {
    private double width;
    private double height;


    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    
    @Override
    public double calculateArea() {
        super.printCalculationMessage(); 
        return width * height;
    }

    
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

public class EnhancedShapesHierarchy {
    public static void main(String[] args) {
        
        cir circle = new cir(5);
        Rect rectangle = new Rect(4, 6);

        
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}