import java.util.Scanner;

public class SumOfFiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int fourthNumber = Integer.parseInt(scanner.nextLine());
        int fifthNumber = Integer.parseInt(scanner.nextLine());

        int sum  = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;

        System.out.printf("%d",sum);
    }
}