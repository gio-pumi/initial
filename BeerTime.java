import java.util.Scanner;

public class BeerTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int line = 0; line < n; line++) {
            System.out.println();
            for (int stars = 0; stars < n; stars++) {
                //System.out.println();
                System.out.print("*");

                if(stars == line) {
                    break;
                }
            }
        }
    }
}