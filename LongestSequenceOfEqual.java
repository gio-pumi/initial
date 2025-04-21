import java.util.ArrayList;
import java.util.Scanner;

public class LongestSequenceOfEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer nNumber =Integer.parseInt(scanner.nextLine());
        Integer[] numbersList = new Integer[nNumber];

        int maxRepeated = 0;
        int last = 0;

        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < nNumber; i++) {
            numbersList[i] = Integer.parseInt(scanner.nextLine());
            if (numbersList[i] == last ) {
               maxRepeated++;
            }
            else{
                list.add (maxRepeated+1);
                maxRepeated = 0;
                last = numbersList[i];

            }
        }

        for (int i = 0; i < list.size(); i++) {
            maxRepeated = Math.max(maxRepeated, list.get(i));
        }
        System.out.println(maxRepeated);
    }
}