import java.util.ArrayList;
import java.util.Scanner;

public class BelowAndAboveAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] listArray = input.split(",");

        Double avg ;
        Double sum = 0.00;
        String below = "";
        String above = "";


        for (int i = 0; i < listArray.length; i++) {
            sum+= Integer.parseInt(listArray[i]);
        }
        avg = sum / listArray.length;

        //Fill below array
        for (int i = 0; i < listArray.length; i++) {
            if(Double.parseDouble(listArray[i]) < avg)
            {
                below += listArray[i] + ",";
            }
        }
        //Fill above array
        for (int i = 0; i < listArray.length; i++) {
            if(Integer.parseInt(listArray[i])> avg)
            {
                    above += listArray[i] + ",";
            }
        }


        System.out.printf("avg: %.2f \n",avg);
        System.out.println("below: "+below.substring(0,below.length()-1));
        System.out.println("above: "+above.substring(0,above.length()-1));
    }
}