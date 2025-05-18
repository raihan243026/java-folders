import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenNumbersInRangeArray {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the starting number: ");
            int start = input.nextInt();
            
            System.out.print("Enter the ending number: ");
            int end = input.nextInt();
            
            if (start > end) {
                System.out.println("Error: Starting number cannot be greater than the ending number.");
                input.close();
                return;
            }
            
            // Use a List to dynamically store even numbers
            List<Integer> evenNumbersList = new ArrayList<>();
            
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    evenNumbersList.add(i);
                }
            }
            
            // Convert the List to an array (if strictly required to use an array for printing)
            Integer[] evenNumbersArray = evenNumbersList.toArray(Integer[]::new);
            
            System.out.println("Even numbers in the range [" + start + ", " + end + "] are:");
            for (int number : evenNumbersArray) {
                System.out.print(number + " ");
            }
            System.out.println(); // Add a newline at the end
        }
    }
}