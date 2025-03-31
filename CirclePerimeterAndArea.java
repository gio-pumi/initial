import java.util.Scanner;

public class CirclePerimeterAndArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double radius = Double.parseDouble(scanner.nextLine());


        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.printf("%.2f \n",perimeter );
        System.out.printf("%.2f",area);


    }

}
