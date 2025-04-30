
import java.util.Scanner;

public class IsArrayInWaveForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] listArray = input.split(" ");

        boolean isVawe = false;
        String vawe = "";

        for (int j = 0; j < listArray.length-1; j++) {
            if (Integer.parseInt(listArray[j]) != Integer.parseInt(listArray[j + 1])) {
                if (j == 0 && Integer.parseInt(listArray[j]) < Integer.parseInt(listArray[j + 1])) {
                    ;
                    vawe = "up";
                    isVawe = true;
                } else if (j == 0 && Integer.parseInt(listArray[j]) > Integer.parseInt(listArray[j + 1])) {
                    ;
                    vawe = "down";
                    isVawe = true;
                } else if (Integer.parseInt(listArray[j]) < Integer.parseInt(listArray[j + 1])
                        && vawe == "up") {
                    isVawe = false;
                    break;
                } else if (Integer.parseInt(listArray[j]) < Integer.parseInt(listArray[j + 1])
                        && vawe == "down")
                    vawe = "up";
                else if (Integer.parseInt(listArray[j]) > Integer.parseInt(listArray[j + 1])
                        && vawe == "down") {
                    isVawe = false;
                    break;
                } else if (Integer.parseInt(listArray[j]) > Integer.parseInt(listArray[j + 1])
                        && vawe == "up")
                    vawe = "down";
            } else {
                isVawe = false;
                break;
            }
        }
                if (isVawe)
                    System.out.println("yes");
                else
                    System.out.println("no");
    }
}