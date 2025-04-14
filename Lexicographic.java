
import java.util.Scanner;

public class Lexicographic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //your code here

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        String[] firstArray = firstString.split("");
        String[] secondArray = secondString.split("");

        int[] num1 = new int[firstArray.length];
        int[] num2 = new int[secondArray.length];

        if (firstArray.length > secondArray.length)
            System.out.println("second");
        else if (firstArray.length < secondArray.length)
            System.out.println("first");
        else {
            int firstWordLexicCount = 0;
            int secondWordLexicCount = 0;


            String[] alphabet = {"-", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                    "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

            for (int i = 0; i <= firstArray.length - 1; i++) {
                for (int j = 1; j <= alphabet.length; j++) {
                    if (firstArray[i].equals(alphabet[j])) {
                        num1[i] = j;
                        break;
                    }
                }
            }

            for (int i = 0; i <= num2.length - 1; i++) {
                System.out.println(num1[i]);
            }

            for (int i = 0; i <= secondArray.length - 1; i++) {
                for (int j = 1; j <= alphabet.length; j++) {
                    if (secondArray[i].equals(alphabet[j])) {
                        num2[i] = j;
                        break;
                    }
                }
            }

            for (int i = 0; i <= num2.length - 1; i++) {
                if (num2[i] > num1[i])
                    System.out.println(num1[i]);
                else if (num2[i] < num1[i]) {
                    System.out.println(num1[i]);
                } else
                        System.out.println(num2[i]);
                }
            }
        }
    }

