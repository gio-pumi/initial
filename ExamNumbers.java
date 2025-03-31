import java.util.Scanner;

public class ExamNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intervalStart = Integer.parseInt(scanner.nextLine());
        int intervalEnd = Integer.parseInt(scanner.nextLine());
        int targetSum = Integer.parseInt(scanner.nextLine());

        int intervalSum = 0;

        int temp = 0;

        for (int i = intervalStart; i <= intervalEnd; i++) {
            temp = i;

            intervalSum += temp % 10;

            temp = temp / 10;
            intervalSum += temp % 10;
            temp = temp / 10;
            intervalSum += temp;

            if(intervalSum == targetSum){
                System.out.println(i);
            }
            intervalSum = 0;
        }
    }
}