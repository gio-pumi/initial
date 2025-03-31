import java.util.Scanner;

public class Time {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        int dayInSeconds = (day * 24) * 60 * 60;
        int hourInSeconds = (hour * 60) * 60;
        int minInSeconds = (minute * 60);

        int sum = dayInSeconds + hourInSeconds +minInSeconds +second;

        System.out.println(sum);
    }
}