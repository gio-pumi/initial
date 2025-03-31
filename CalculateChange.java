import java.util.Scanner;

public class CalculateChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = scanner.nextDouble();
        double payed = scanner.nextDouble();
        double change = 0;
        int leva = 0;

        change = payed - price;

        if(change > 1) {
            leva = (int)change;

            change = change - (double)leva;
            System.out.println(leva +" x 1 lev");

            change = Math.round(change * 100.0) / 100.0;
            int lastChange = (int)(change*100);

            if(lastChange >= 50) {
                System.out.println("1 x 50 stotinki");
                lastChange = lastChange - 50;
            }
            if (lastChange >= 20) {
                System.out.println((int)(lastChange/20) +" x 20 stotinki");
                lastChange = lastChange - (int)(lastChange/20) * 20;
            }
            if (lastChange >= 10) {
                System.out.println((int)lastChange/10 + " x 10 stotinki");
                lastChange = lastChange - (int)(lastChange/10) *10;
            }
            if (lastChange >= 5) {
                System.out.println((int)lastChange/5 + " x 5 stotinki");
                lastChange = lastChange - (int)(lastChange/5) * 5;
            }
            if (lastChange >= 2) {
                System.out.println((int)lastChange/2 + " x 2 stotinki");
                lastChange = lastChange - (int)(lastChange/2) * 2;
            }
            if (lastChange >= 1) {
                System.out.println(lastChange + " x 1 stotinka");
            }
        }else
        {
            change = Math.round(change * 100.0) / 100.0;
            int lastChange = (int)(change*100);

            if(lastChange >= 50) {
                System.out.println("1 x 50 stotinki");
                lastChange = lastChange - 50;
            }
            if (lastChange >= 20) {
                System.out.println((int)(lastChange/20) +" x 20 stotinki");
                lastChange = lastChange - (int)(lastChange/20) * 20;
            }
            if (lastChange >= 10) {
                System.out.println((int)lastChange/10 + " x 10 stotinki");
                lastChange = lastChange - (int)(lastChange/10) *10;
            }
            if (lastChange >= 5) {
                System.out.println((int)lastChange/5 + " x 5 stotinki");
                lastChange = lastChange - (int)(lastChange/5) * 5;
            }
            if (lastChange >= 2) {
                System.out.println((int)lastChange/2 + " x 2 stotinki");
                lastChange = lastChange - (int)(lastChange/2) * 2;
            }
            if (lastChange >= 1) {
                System.out.println(lastChange + " x 1 stotinka");
            }
        }
    }
}
