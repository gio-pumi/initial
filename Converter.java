import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mpg = Double.parseDouble(scanner.nextLine());

        double kpg = mpg * 1.6;
        double gp1k = 1/kpg;
        double lp1k= gp1k * 4.54;

        //liter per 100 km
        double lp100k = Math.floor(lp1k * 100);
        System.out.println((int)lp100k +"litres per 100 km");
    }
}
