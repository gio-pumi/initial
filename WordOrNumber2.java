import java.util.Scanner;

public class WordOrNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToTry = scanner.nextInt();
        String text = "";

        int resultInt = 0;
        String resultString = "";
        String result = "";
        String previous = "";

        while (numberToTry >= 1) {
            text = scanner.next();

            if (text.contains("0") || text.contains("1") || text.contains("2") || text.contains("3") || text.contains("4")
                    || text.contains("5") || text.contains("6") || text.contains("7")
                    || text.contains("8") || text.contains("9")) {

                if(previous.contains("num")){
                    resultInt = resultInt +  Integer.parseInt(text);
                }
                else{
                    resultInt = Integer.parseInt(text);
                   // if(resultString.charAt(resultString.length()-1) == '-'){
                   //     resultString = resultString.substring(0, resultString.length()-1);}
                    result =  result + "\n" + resultString;
                    resultString = "";
                    previous = "num";
                }
            }
            else {
                if(previous.equals("text")){
                    resultString += "-" + text;
                    previous = "text";
                }else{
                    resultString = text;
                    if(result.isEmpty()) {
                      result =  result + "\n";
                    }
                    else
                        result =  result + "\n" +resultInt;
                    resultInt = 0;
                    previous = "text";
                }

            }
            numberToTry--;
        }

       if(!resultString.isEmpty()) {
           result += "\n"+ resultString;
       }else if(resultInt != 0) {
           result += "\n"+ resultInt;
       }

        System.out.println(result);
    }
}