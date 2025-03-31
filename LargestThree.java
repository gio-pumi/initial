
import java.util.Scanner;

public class LargestThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int temp = 0;
        int largest = -500;
        int second_largest = -500;
        int third_largest = -500;


        for (int i = 0; i < number; i++) {
            temp = scanner.nextInt();

            if (temp > largest) {
                third_largest = second_largest;
                second_largest = largest;
                largest = temp;
            }else if (temp > second_largest){
                third_largest = second_largest;
                second_largest = temp;
            } else if (temp > third_largest) {
                third_largest = temp;
            }
        }
        System.out.printf("%d, %d and %d",largest,second_largest,third_largest);
    }
}