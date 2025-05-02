
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] listArray = input.split(",");


        int[] newArray = new int[listArray.length];
        int temp = 0;


        for (int i = 0; i < listArray.length; i++) {
                if(Integer.parseInt(listArray[i]) != 0) {
                        newArray[temp] = Integer.parseInt(listArray[i]);
                        temp++;
                }
        }

        for (int i = temp+1; i < listArray.length-temp; i++){
            newArray[i] = 0;
        }

        for (int i = 0; i < newArray.length; i++){
            if(i < newArray.length-1)
            System.out.printf( newArray[i]+",");
            else
            System.out.printf( newArray[i]+"");
        }
    }
}