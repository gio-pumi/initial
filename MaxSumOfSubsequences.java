
import java.util.Scanner;

public class MaxSumOfSubsequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //your code here
        Integer nList =Integer.parseInt(scanner.nextLine());
        int maxSum = 0;
        int sum = 0;
        int temp= 0;


        for (int i = 0; i < nList ; i++) {
             temp = Integer.parseInt(scanner.nextLine());
             sum += temp;
             if(sum > maxSum)
                 maxSum = sum;
             if(sum <0)
                 sum = 0;
        }

        System.out.println(maxSum);
    }
}