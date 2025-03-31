
import java.util.Scanner;

public class NumbersFrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nNumbers = Integer.parseInt(scanner.nextLine());
        String numbers = scanner.nextLine();
        int productOfOdds = 1;
        int productOfEvens = 1;

        if(nNumbers >= 4 && nNumbers <= 50) {
            numbers = numbers.replaceAll(" ", "");

           if(numbers.length()>= 4 && numbers.length() <=50){

            for (int i = 0; i <= numbers.length()-1; i++) {
                if ((i+1) % 2 != 0) {
                      productOfEvens = productOfEvens * Integer.parseInt(numbers.substring(i, i+1));
                }
                if ((i+1) % 2 == 0){
                    productOfOdds = productOfOdds * Integer.parseInt(numbers.substring(i, i+1));
                }
            }

            if(productOfEvens == productOfOdds){
                System.out.printf("yes "+ productOfEvens);
            }
            else{
                System.out.printf("no "+ productOfEvens+" "+productOfOdds);
            }
            }
        }
    }
}