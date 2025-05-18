public class Main {
    String brand;
    String model;
    double price;
    // Constructor to set data
    public Main(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    // Display car information
    public void displayCar() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
    public static void main(String[] args) {
        // Create a Main object using the constructor
        Main myCar = new Main("Toyota", "Camry", 25000.00);

        // Display the car information
        myCar.displayCar();
    }
}