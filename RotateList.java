
import java.util.Scanner;

public class RotateList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] listArray = input.split(",");
        Integer nToShift = Integer.parseInt(scanner.nextLine());

        String[] reversedArray = new String[listArray.length];

        for (int j = 0; j < nToShift; j++) {
            for (int i = 0; i < listArray.length; i++) {
                if (i != 0)
                    reversedArray[i - 1] = listArray[i];
                else {
                    reversedArray[listArray.length - 1] = listArray[i];
                }
            }

            for (int i = 0; i < listArray.length; i++) {
                listArray[i] = reversedArray[i];
            }

        }

        for (int i = 0; i < reversedArray.length; i++) {
            if(i < reversedArray.length-1)
            System.out.print(reversedArray[i]+",");
            else
            System.out.print(reversedArray[i]);
        }
    }
}