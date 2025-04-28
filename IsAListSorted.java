
import java.util.Scanner;

public class IsAListSorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer nList =Integer.parseInt(scanner.nextLine());
        String result = "";
        boolean tempResult = false ;

        for (int i = 0; i < nList ; i++) {

            String input = scanner.nextLine();
            String[] listArray = input.split(",");

            for (int j = 0; j < listArray.length; j++) {
               System.out.println(listArray[j]);
                if(Integer.parseInt(listArray[j])<=j+1)
                tempResult = true;
                else{
                    tempResult = false;
                    break;

                }
            }

            if(tempResult)
                result += "true \n";
            else
            result += "false \n";


    }

        System.out.println(result);
}}