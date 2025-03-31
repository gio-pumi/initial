import java.util.Scanner;
import java.lang.Math;

public class SumOfGreatestAndSmallest {
    public static void main(String[] args) {
        /*Read the input
        scanner.nextDouble() is a way to read a double value from the console.
        You can also use scanner.nextLine(), but it reads a line of 'text' from
        the console which then needs to be parsed to a double.*/
        Scanner scanner = new Scanner(System.in);
        double number1 = Double.parseDouble(scanner.nextLine());
        double number2 = Double.parseDouble(scanner.nextLine());
        double number3 = Double.parseDouble(scanner.nextLine());

        /* Math.max() and Math.min() are built-in methods in Java that return the maximum or the minimum of two numbers.
        This code uses each of these methods twice to compare three numbers.
        For example Math.max(number1, Math.max(number2, number3)) compares number2 and number3, and returns the maximum of the two.
        Then, it compares this result with number1 and returns the maximum of the three numbers.*/
        double greatest = Math.max(number1, Math.max(number2, number3));
        double smallest = Math.min(number1, Math.min(number2, number3));

        /*Print the sum of the greatest and smallest numbers with no decimal places using printf() method.*/
        System.out.printf("%f", greatest+smallest);
    }
}
