import java.util.Scanner;

public class BottleDeposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bottleOf05L = Integer.parseInt(scanner.nextLine());
        int bottleOf1L= Integer.parseInt(scanner.nextLine());

        //double bottleOf05LDeposit = bottleOf05L +(bottleOf05L * 0.1);
        //double bottleOf1LDeposit = bottleOf1L +(bottleOf1L * 0.25);

        double totalSumOfDeposit =(bottleOf05L * 0.1) +(bottleOf1L * 0.25);

        System.out.printf("%.2f",totalSumOfDeposit);
    }
}
