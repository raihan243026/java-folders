import java.util.Scanner;

public class SimpleCalculatorEvenEasier {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double number1 = input.nextDouble();
            
            System.out.print("Enter second number: ");
            double number2 = input.nextDouble();
            
            System.out.print("Enter operator (+, -, *, /): ");
            char operation = input.next().charAt(0);
            
            switch (operation) {
                case '+' -> {
                    double sum = number1 + number2;
                    System.out.println("The sum is: " + sum);
                }
                case '-' -> {
                    double difference = number1 - number2;
                    System.out.println("The difference is: " + difference);
                }
                case '*' -> {
                    double product = number1 * number2;
                    System.out.println("The product is: " + product);
                }
                case '/' -> {
                    if (number2 != 0) {
                        double quotient = number1 / number2;
                        System.out.println("The quotient is: " + quotient);
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                }
                default -> System.out.println("Invalid operator!");
            }
        }
    }
}