import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the student's exam marks: ");
            int marks = input.nextInt();
            char grade;
            if (marks >= 90) {
                grade = 'A';
            } else if (marks >= 80) {
                grade = 'B';
            } else if (marks >= 70) {
                grade = 'C';
            } else if (marks >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }   System.out.println("The student's grade is: " + grade);
            // Close the scanner to release resources
        }
    }
}