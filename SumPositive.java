import java.util.Scanner;

public class SumPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integerNumber = Integer.parseInt(scanner.nextLine());
        int sum = integerNumber*(integerNumber+1)/2;
        System.out.printf("%d",sum);
    }
}
