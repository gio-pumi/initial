
import java.util.Scanner;

public class ConvertDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //your code here (0°C × 9/5) + 32 = 32°F
        String firstLine = scanner.nextLine();

        String[] array1 = firstLine.split(" ");

        int [] numArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            numArray[i] = Integer.parseInt(array1[i]);
        }

        for (int i = 0; i < array1.length; i++) {

           numArray[i]=  (numArray[i] * 9/5) + 32;
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.println(numArray[i]+"");
        }
    }
}