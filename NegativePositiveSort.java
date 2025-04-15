
import java.util.Scanner;

public class NegativePositiveSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String[] array1 = firstLine.split(" ");

        int [] numArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            numArray[i] = Integer.parseInt(array1[i]);
        }


        int positive =0;
        int negative =0;


        for (int i = 0; i < numArray.length; i++) {
            if(numArray[i]<0)
                negative++;
            else
                positive++;
        }

        int[] negativeArray = new int[negative];
        int[] positiveArray = new int[positive];


        for (int i = 0; i < numArray[i]; i++) {
            if(numArray[i]<0){
                negativeArray[negative] = numArray[i];
                System.out.print(numArray[i] +" ");

            }
        }
        for (int i = 0; i < numArray[i]; i++) {
            if(numArray[i]>0){
                positiveArray[i] = numArray[i];
                }
        }

        for (int i = 0; i < negative; i++) {
                numArray[i] =  negativeArray[i];
        }
        for (int i = negative++; i < negative; i++) {
            numArray[i] =  positiveArray[i];
        }

    }
}