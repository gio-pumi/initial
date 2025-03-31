import java.util.Scanner;

public class WordOrNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        double result = 0;
        String reversed = "";

        if(word.contains("0") || word.contains("1 ") || word.contains("2") || word.contains("3") || word.contains("4")
           || word.contains("5") || word.contains("6") || word.contains("7") || word.contains("8") || word.contains("9")
         ){
           result = Double.parseDouble(word) + 1;
           System.out.printf("%.1f",result);
        }else
        {
            for (int i = word.length()-1; i >= 0; i--) {
                reversed = reversed + word.charAt(i);
            }
            System.out.println(reversed);
        }
    }
}