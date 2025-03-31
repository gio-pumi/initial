
import java.util.Scanner;

public class NumberComparer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int greaterNumber = firstNumber>secondNumber?firstNumber:secondNumber;

        System.out.printf("%d",greaterNumber);
    }
}
