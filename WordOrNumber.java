import java.util.Scanner;

public class WordOrNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        Integer resultInt = 0;
        Float resultDouble ;
        String reversed = "";

        if(word.contains("0") || word.contains("1") || word.contains("2") || word.contains("3") || word.contains("4")
           || word.contains("5") || word.contains("6") || word.contains("7") || word.contains("8") || word.contains("9")
         )
        {
            if(word.contains(".")){
                resultDouble= Float.parseFloat(word) + 1;
                System.out.printf("%.1f",resultDouble);
            }else{
            resultInt = Integer.parseInt(word) + 1;
            System.out.println(resultInt);
            }
        }
        else {
            for (int i = word.length()-1; i >= 0; i--) {
                reversed = reversed + word.charAt(i);
            }
            System.out.println(reversed);
        }
    }
}