
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

        int minLength = 0;
        if (firstArray.length < secondArray.length) {
            minLength = firstArray.length;
        } else if (secondArray.length < firstArray.length) {
            minLength = secondArray.length;
        }else
            minLength = firstArray.length;


        int firstWordLexicCount = 0;
        int secondWordLexicCount = 0;


        String[] alphabet = {"-", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (firstArray[i].equals(alphabet[j])) {
                    num1[i] = j;
                    break;
                }
            }
        }

        for (int i = 0; i < secondArray.length ; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (secondArray[i].equals(alphabet[j])) {
                    num2[i] = j;
                    break;
                }
            }
        }

            Boolean isEqual= false;
            if (num1.length == num2.length) {
                isEqual = true;
            }


        for (int i = 0; i < minLength; i++) {
                if(num1[i]>num2[i]){
                    System.out.print("second");
                    break;
                }
                else if(num1[i]<num2[i]){
                    System.out.print("first");
                    break;
                }
                else{
                    if(i==minLength-1 && isEqual){
                        System.out.print("equal");
                        break;
                    }else if(i==minLength-1 && isEqual==false){
                    if(num1.length>num2.length){
                        System.out.print("second");
                        break;
                    }else{
                        System.out.print("first");
                        break;
                    }
                    }
                }
            }
        }
}

