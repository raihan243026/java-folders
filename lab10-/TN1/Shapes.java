// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate area
    public abstract double area();
}

// Circle class implementing Shape
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of area method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class implementing Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of area method
    @Override
    public double area() {
        return length * width;
    }
}

// Main class to test the implementation
public class Shapes {
    public static void main(String[] args) {
        // Create instances
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Test area calculations
        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rectangle.area());
    }
}