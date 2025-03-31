import java.util.Scanner;

public class CrookedDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String originalNumber = scanner.nextLine();

        if(originalNumber.contains("."))
        {
            originalNumber = originalNumber.replace(".", "");
        }

        long sum = 10;
        long leftDigits =  Long.parseLong(originalNumber);
        leftDigits = Math.abs(leftDigits);

        long lastDigit = 0;

        while(sum > 9)
        {
            sum = 0;
            while(leftDigits >= 10)
            {
                lastDigit = leftDigits % 10;
                leftDigits = leftDigits / 10;
                sum += lastDigit;
            }
            sum += leftDigits;
            leftDigits = sum;
        }
        System.out.println(sum);
    }
}
