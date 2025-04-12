import java.util.Scanner;

public class ArraySerch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();

        String[] array1 = firstLine.split(",");

        String result ="";
        Boolean contains = false;

        for (int i = 1; i <= array1.length; i++) {

             for (int j = 0; j < array1.length; j++) {
                 if (Integer.parseInt(array1[j] ) == i)
                 {
                     contains = true;
                 break;
                 }else
                     contains = false;
             }

             if (!contains) {
             result += i +",";
             }

        }
        System.out.println(result);
}
}
