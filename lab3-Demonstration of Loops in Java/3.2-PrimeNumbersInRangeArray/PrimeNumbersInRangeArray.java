import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbersInRangeArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = input.nextInt();

        System.out.print("Enter the ending number: ");
        int end = input.nextInt();

        if (start > end) {
            System.out.println("Error: Starting number cannot be greater than the ending number.");
            input.close();
            return;
        }

        List<Integer> primeNumbersList = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeNumbersList.add(i);
            }
        }

        Integer[] primeNumbersArray = primeNumbersList.toArray(new Integer[0]);

        System.out.println("Prime numbers in the range [" + start + ", " + end + "] are:");
        if (primeNumbersArray.length > 0) {
            for (int prime : primeNumbersArray) {
                System.out.print(prime + " ");
            }
            System.out.println(); // Add a newline at the end
        } else {
            System.out.println("No prime numbers found in this range.");
        }

        input.close();
    }

    // Helper function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}