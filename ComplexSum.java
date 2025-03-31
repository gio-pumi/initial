    import java.util.Scanner;

public class ComplexSum {
    public static void main(String[] args) {
        // The scanner is used to read input
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

         String result = "";


        for (int i = 0; i <= number+1; i++) {

             if (number % 2 == 0) {

                 number /= 2;
              // System.out.println(number +" "+ i);
                result = result +  2 + " \n";

            }else if (number % 3 == 0) {
                number /= 3;
                result = result + 3 + " \n";
            }else if (number % 5 == 0) {
                number /= 5;
                result = result + 5 + " \n";
            } else if (number % 7 == 0) {
               number /= 7;
                result = result + 7 + " \n";
            } else if (number % 9 == 0) {
                number /= 9;
                result = result + 9 + " \n";
            }
        }
        System.out.println(result);

    }

}
