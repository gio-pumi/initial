
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

        int neg =0;
        int pos =0;

        for (int i = 0; i < numArray.length; i++) {
            if(numArray[i]<0)
            {
                negativeArray[neg] = numArray[i];
                neg++;
            }else {
                positiveArray[pos] = numArray[i];
                pos++;
            }
        }

        for (int i = 0; i < negative; i++) {
            System.out.print(negativeArray[i] +" ");

        }
        for (int i = 0; i < positive; i++) {
            System.out.print(positiveArray[i] +" ");

        }

    }
}