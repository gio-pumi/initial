import java.util.Scanner;

public class BiggestOfTree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        int biggest;
        int biggest2;
        int last;

        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) {
                biggest = firstNumber;
                if (secondNumber > thirdNumber) {
                    biggest2 = secondNumber;
                    last = thirdNumber;
                }
                else {
                    biggest2 = thirdNumber;
                    last = secondNumber;
                }
            }else {
                biggest = thirdNumber;
                biggest2 = firstNumber;
                last = secondNumber;
            }
        }else if(secondNumber > thirdNumber) {
            biggest = secondNumber;
                if (firstNumber > thirdNumber) {
                    biggest2 = firstNumber;
                    last = thirdNumber;
                }else {
                    biggest2 = thirdNumber;
                    last = firstNumber;
                }
        }else{
            biggest = thirdNumber;
            biggest2 = secondNumber;
            last = firstNumber;}

        System.out.printf("%d %d %d",biggest,biggest2,last);
    }
 }
