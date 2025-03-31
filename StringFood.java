import java.util.Scanner;

public class StringFood {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        String food = scanner.nextLine();


        int lastRatio = 2;
        int vowels = 0 ;
        int ratio = 0;
        String largestName = "";
        String result = "";

        while(lines-1 >= 1) {
            for (int i = 0; i < food.length() ; i++) {
                switch (food.charAt(i)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        vowels++;
                    break;
                }
            }
            ratio = vowels/food.length();

           if (ratio < lastRatio ) {
               result = food +" "+ vowels + "/"+ food.length() ;
               lastRatio = ratio;
           }else if (ratio == lastRatio) {

           }


            vowels = 0;
            food = scanner.nextLine();
            lines--;
        }

        System.out.println(result);

    }
}