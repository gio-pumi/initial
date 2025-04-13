
import java.util.Scanner;

public class Lexicographic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //your code here

        String firstString= scanner.nextLine();
        String secondString = scanner.nextLine();

        String[] firstArray = firstString.split("");
        String[] secondArray = secondString.split("");

        int firstWordLexicCount =0;
        int secondWordLexicCount =0;

        int[] num1 = new int[firstArray.length];
        int[] num2 = new int[firstArray.length];

        String[] alphabet = {"-","a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (int i = 0; i < firstArray.length; i++) {
            for (int j= 1; j <= alphabet.length; j++) {
                if(alphabet[j].equals(firstArray[j])){
                    num1[i] = j;
                    break;
                }
            }
        }
 /*
        for (int i = 0; i < secondArray.length; i++) {
            for (int j= 1; j <= alphabet.length; j++) {
                if(secondArray[i].equals(alphabet[j])){
                    num2[i] = j;
                    break;
                }
            }
        }

        for (int i = 0; i < secondArray.length; i++) {
            if(num1[i]<num2[i]){
                System.out.println("first");
                break;
            }
            else  if(num1[i]>num2[i]){
                System.out.println("first");
                 break;}
            else
                System.out.println("equal");
*/
        }

}