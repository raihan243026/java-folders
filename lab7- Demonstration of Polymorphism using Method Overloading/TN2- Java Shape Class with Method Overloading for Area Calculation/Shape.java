public class Shape {
    // Method to calculate area of rectangle
    public double area(double length, double width) {
        return length * width;
    }

    // Method to calculate area of circle
    public double area(double radius) {
        return 3.14159 * radius * radius;
    }

    public static void main(String[] args) {
        Shape shape = new Shape();

        // Test with rectangle
        double rectArea = shape.area(5.0, 3.0);
        System.out.println("Area of rectangle (5.0 x 3.0): " + rectArea);

        // Test with circle
        double circleArea = shape.area(2.0);
        System.out.println("Area of circle (radius 2.0): " + circleArea);
    }
}
