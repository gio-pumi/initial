import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        String resulyString = "";
        for (int i = number.length()-1; i >= 0 ; i--) {
            resulyString += number.charAt(i);
        }

        System.out.println(resulyString);
    }
}