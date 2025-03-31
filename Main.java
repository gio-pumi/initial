
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Please type a number for choosing from next options: ");
        System.out.println(" ");

        List<String> options = new LinkedList<String> ();
        options.add("1 for making an order");
        options.add("2 for listing all the orders of the user");
        options.add("3 to request help with an order");
        options.add("4 to request cancellation of an order");
        options.add("0 to exit the main menu and the program");

        for(String option : options)
        {
            System.out.println(option);
        }
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);


        List<String> products = new LinkedList<String> ();
        products.add("01.Potato");
        products.add("02.Fish");
        products.add("03.Apple");
        products.add("04.Orange");
        products.add("05.Milk");
        products.add("06.Music");

        for(String product : products)
        {
            System.out.println(product);
        }

        /*       for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        */
    }
}

