import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();


        double x1 = ((-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a));
        double x2 = ((-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a));

        x1 = x1 == 0 ? Math.abs(x1) : x1;
        System.out.printf("x1=%.1f \n",x1);
        x2 = x2 == 0 ? Math.abs(x2) : x2;
        System.out.printf("x2=%.1f \n",x2);
    }
}