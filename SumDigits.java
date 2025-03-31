import java.util.Scanner;

public class SumDigits {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int number = Integer.parseInt(scanner.nextLine());
            int sum = 0;

            int lastDigit = number % 10;
            sum = sum +lastDigit;
            number = (number-lastDigit)/10;

            lastDigit = number % 10;
            sum = sum +lastDigit;
            number = (number-lastDigit)/10;

            lastDigit = number % 10;
            sum = sum +lastDigit;
            number = (number-lastDigit)/10;

            lastDigit = number % 10;
            sum = sum +lastDigit;
            number = (number-lastDigit)/10;



            System.out.printf("%d \n",sum);
        }
    }
