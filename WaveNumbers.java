import java.util.Scanner;

public class WaveNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();

            String result = "";


            for (int i = 1; i <= number; i++) {
                result  = result + i +"";
            }
            for (int i = number; i >= 1; i--) {
                if (i != number) {
                    result  = result + i +"";
                }

            }

            System.out.println(result);
    }
}