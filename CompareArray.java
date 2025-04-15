
import java.util.Scanner;

public class CompareArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[n];
        int[] secondtArray = new int[n];
        int counter = 0;

        for (int i = 0; i < n; i++) {
            firstArray[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < n; i++) {
            secondtArray[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < n; i++) {
            if (firstArray[i] == secondtArray[i]) {
            counter++;            }
        }

        if (counter == n) {
            System.out.println("equal");
        }else
            System.out.println("not equal");

    }
}