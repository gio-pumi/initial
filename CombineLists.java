import java.util.Scanner;

public class CombineLists{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstList = scanner.nextLine().split(",");
        String[] secondList = scanner.nextLine().split(",");

        String result = "";

        for (int i = 0; i < firstList.length; i++) {
           result += firstList[i] + "," + secondList[i] +",";
        }

        if(result.charAt(result.length()-1) == ','){
            result = result.substring(0, result.length() - 1);
        }
        System.out.println(result);
    }
}
