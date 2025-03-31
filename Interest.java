import java.util.Scanner;

public class Interest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double depositBefore = scanner.nextDouble();
        double depositAfterOneYears = depositBefore + depositBefore * 0.05;
        double depositAfterTwoYears = depositAfterOneYears + depositAfterOneYears * 0.05;
        double depositAfterTreeYears = depositAfterTwoYears + depositAfterTwoYears * 0.05;


        System.out.printf("%.2f \n",depositAfterOneYears);
        System.out.printf("%.2f \n",depositAfterTwoYears);
        System.out.printf("%.2f \n",depositAfterTreeYears);
    }
}