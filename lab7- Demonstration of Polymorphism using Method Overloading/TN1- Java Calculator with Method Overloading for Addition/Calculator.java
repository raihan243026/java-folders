public class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two floats
    public float add(float a, float b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Test with two integers
        int intSum = calc.add(5, 3);
        System.out.println("Sum of integers 5 and 3: " + intSum);

        // Test with two floats
        float floatSum = calc.add(5.5f, 3.2f);
        System.out.println("Sum of floats 5.5 and 3.2: " + floatSum);

        // Test with three integers
        int tripleSum = calc.add(2, 3, 4);
        System.out.println("Sum of integers 2, 3, and 4: " + tripleSum);
    }
}
