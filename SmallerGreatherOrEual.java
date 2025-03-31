import java.util.Scanner;

public class SmallerGreatherOrEual {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = Integer.parseInt(scanner.nextLine());
            String equalize = "";
            int last = 0;

            for (int i = 0; i < number; i++) {
                int num = Integer.parseInt(scanner.nextLine());
                if(i==0){
                    equalize = ""+ num;
                    last = num;
                }else{
                if (num > last) {
                    equalize = equalize + "<" + num;
                    last = num;
                } else if (num < last) {
                    equalize = equalize + ">" + num;
                    last = num;
                } else {
                    equalize = equalize + "=" + num;
                    last = num;
                }
                }
            }

            System.out.println(equalize);
        }
}