import java.util.Scanner;

public class LongestSequenceOfEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer nNumber =Integer.parseInt(scanner.nextLine());
        Integer[] numbersList = new Integer[nNumber];

        int maxRepeated = 0;

        for (int i = 0; i < nNumber; i++) {
            numbersList[i] = Integer.parseInt(scanner.nextLine());
        }
    }
}