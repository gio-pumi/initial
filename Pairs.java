
import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer nNumber =Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        String[] listArray = input.split(" ");

        String result = "";

        for (int i = 0; i < listArray.length; i++) {
            for (int j = i + 1; j < listArray.length; j++) {
                if (Integer.parseInt(listArray[i]) + Integer.parseInt(listArray[j]) == nNumber)
                  result += listArray[i] + "," + listArray[j]+ "\n";
            }

        }

        if(result.equals(""))
            result = "no pairs";
        System.out.println(result);

    }
}