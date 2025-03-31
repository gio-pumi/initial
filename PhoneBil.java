import java.util.Scanner;

public class  PhoneBil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String typeOfInput = scanner.nextLine();
        String input = scanner.next();

        switch (typeOfInput){
            case ("integer"):
                int integ = Integer.parseInt(input)+ 1;
                System.out.printf("%d \n", integ);
                break;
            case "real":
                double doub = Double.parseDouble(input) + 1;
                System.out.printf("%.2f \n", doub);
                break;
            case "text":
                System.out.println(input + "*");
                break;
        }
    }
}