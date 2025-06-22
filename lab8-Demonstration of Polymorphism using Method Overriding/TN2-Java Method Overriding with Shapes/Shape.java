public class Shape {
    public void draw() {
        System.out.println("Drawing shape");
    }

    public static void main(String[] args) {
        Shape genericShape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        genericShape.draw();
        circle.draw();
        rectangle.draw();
        System.out.println("Execution time: 09:45 PM +06, Sunday, June 22, 2025");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}