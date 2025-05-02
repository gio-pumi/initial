import java.util.Scanner;

public class RepeatingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer nNumbers =Integer.parseInt(scanner.nextLine());
        int[] countArray = new int[11];
        int max = 0;
        int minIndex = 11;


        for (int i = 0; i < nNumbers ; i++) {
            Integer number = Integer.parseInt(scanner.nextLine());

            for (int j = 1; j <= countArray.length ; j++) {
                if(number == j)
                  countArray[j]++;
            }
        }


        for (int i = 1; i < countArray.length ; i++) {
            if(countArray[i] >= max && i < minIndex) {
                max = countArray[i];
                minIndex = i;
            }
        }

        System.out.printf(minIndex+"");
    }
}