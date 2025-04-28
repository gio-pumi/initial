
import java.util.Scanner;

public class SymmetricArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer nList =Integer.parseInt(scanner.nextLine());
        String result = "";
        boolean tempResult = false ;

        for (int i = 0; i < nList ; i++) {
            String input = scanner.nextLine();
            String[] listArray = input.split(" ");

            for (int j = 0; j < listArray.length; j++) {
                if(Integer.parseInt(listArray[j]) == (Integer.parseInt(listArray[listArray.length - 1 - j])))
                    tempResult = true;
                else
                    tempResult = false;
            }

            if(tempResult)
                result += "Yes\n";
            else
                result += "No\n";
         }

        System.out.println(result);
    }
}