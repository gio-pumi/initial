import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int sum  = firstNumber + secondNumber;
        int subFromFirstNumber  = firstNumber - secondNumber;
        int productOfFirstAndSecondNumbers  = firstNumber * secondNumber;
        int reminderDivideFirstUmberBySecondNumber  = firstNumber % secondNumber;
        double  poweredBySecondNumber  = Math.pow(firstNumber,secondNumber);

        System.out.printf("%d \n",sum);
        System.out.printf("%d \n",subFromFirstNumber);
        System.out.printf("%d \n",productOfFirstAndSecondNumbers);
        System.out.printf("%d \n",reminderDivideFirstUmberBySecondNumber);
        System.out.printf("%d \n",(int)poweredBySecondNumber);
    }
}
