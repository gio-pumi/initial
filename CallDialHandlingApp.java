import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CallDialHandlingApp {
    public static void main(String[] args) {
        System.out.println(
                " 1 making an order \n" +
                " 2 listing all the orders of the user \n" +
                " 3 request help with an order \n" +
                " 4 request cancellation of an order \n" +
                " 0 exit the main menu and the program ");
        Scanner scanner = new Scanner(System.in);
        String[] products = {"01.Potato", "02.Fish", "03.Apple", "04.Orange", "05.Milk", "06.Music"};

        System.out.println(" Enter 2 digit product code or 00 to finish the order \n Here are the products and their codes: " + Arrays.toString(products));
        ArrayList<String> orders = new ArrayList<String>();

        Integer nNumber = Integer.parseInt(scanner.nextLine());

    }
}