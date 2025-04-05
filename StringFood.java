import java.util.Scanner;
import java.util.SortedSet;

public class StringFood {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        String food ="asdasdasdasd";


        int ratio = 0;
        int vowels = 0 ;
        String result = "";

        int lastRatio = 2;
        int lastVowels = 0;
        String lastFood = "";

        while(lines >= 1) {

            food = scanner.nextLine();
            //counts vowels in the inputted word
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
            //counts ratio
            ratio = vowels/food.length();
            System.out.println(food.length());

           if (ratio < lastRatio )
           {
               result = food +" "+ vowels + "/"+ food.length() ;
               lastRatio = ratio;
               System.out.println(lastRatio + "lastRAtio");
           }else if (ratio == lastRatio) {
               System.out.println("Hello");
               System.out.println(ratio);
               System.out.println(lastRatio);

                if (vowels > lastVowels){
                    result = food +" "+ vowels + "/"+ food.length() ;
                }else if(vowels < lastVowels) {
                    result = lastFood +" "+ lastVowels + "/"+ lastFood.length() ;
                }else
                {
                    if (food.length() > lastFood.length()) {
                        result = food +" "+ vowels + "/"+ food.length() ;
                    }
                    else
                        result = lastFood +" "+ lastVowels + "/"+ lastFood.length() ;
                }
           }

            //set vowels and food
            lastVowels = vowels;
            lastFood = food;



            vowels = 0;
            lines--;
        }

        System.out.println(result);
    }
}