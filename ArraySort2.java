import java.util.Scanner;

public class ArraySort2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] listArray = input.split(",");

        int leftStart = 0;
        int rightStart = listArray.length-1;

        String[] newArray = new String[listArray.length];

        for (int i = 0; i < listArray.length; i++) {
            if(Integer.parseInt(listArray[i]) == 0) {
               newArray[rightStart] = listArray[i];
               rightStart--;
            }
            else {
                newArray[leftStart] = listArray[i];
                leftStart++;
            }
        }

       System.out.printf(String.join(",",newArray));
    }
}