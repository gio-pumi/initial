import java.util.Scanner;

public class NumbersAsWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        String word = "";
        int hundreds = 0;
        int tens = 0;

        if(number != 0){
            if (number > 100) {
                hundreds = number / 100;
                switch (hundreds) {
                    case 1:
                        word = "one";
                        break;
                    case 2:
                        word = "two";
                        break;
                    case 3:
                        word = "three";
                        break;
                    case 4:
                        word = "four";
                        break;
                    case 5:
                        word = "five";
                        break;
                    case 6:
                        word = "six";
                        break;
                    case 7:
                        word = "seven";
                        break;
                    case 8:
                        word = "eight";
                        break;
                    case 9:
                        word = "nine";
                        break;
                    default:
                        break;
                }
                word = word + " hundred";

                if(!(number%100 == 0)) {
                    word = word + " and ";
                }
                number = number - (hundreds * 100);
            }

            if (number >= 20) {
                tens = number / 10;
                switch (tens) {

                    case 2:
                        word = word + "twenty ";
                        break;
                    case 3:
                        word = word + "thirty ";
                        break;
                    case 4:
                        word = word + "Forty ";
                        break;
                    case 5:
                        word = word + "fifty ";
                        break;
                    case 6:
                        word = word + "sixty ";
                        break;
                    case 7:
                        word = word + "seventy ";
                        break;
                    case 8:
                        word = word + "eighty ";
                        break;
                    case 9:
                        word = word + "ninety ";
                        break;
                    default:
                        break;
                }
            }

            if (number > 10 && number < 20) {
                switch (number) {
                    case 11:
                        word = word + "eleven ";
                        break;
                    case 12:
                        word = word + "twelve ";
                        break;
                    case 13:
                        word = word + "thirteen ";
                        break;
                    case 14:
                        word = word + "fourteen ";
                        break;
                    case 15:
                        word = word + "fifteen ";
                        break;
                    case 16:
                        word = word + "sixteen ";
                        break;
                    case 17:
                        word = word + "seventeen ";
                        break;
                    case 18:
                        word = word + "eighteen ";
                        break;
                    case 19:
                        word = word + "nineteen ";
                        break;
                }
            }
                number = number - (tens * 10);

            if (number <= 10) {
                    switch (number) {
                        case 1:
                            word = word + "one";
                            break;
                        case 2:
                            word = word + "two";
                            break;
                        case 3:
                            word = word + "three";
                            break;
                        case 4:
                            word = word + "four";
                            break;
                        case 5:
                            word = word + "five";
                            break;
                        case 6:
                            word = word + "six";
                            break;
                        case 7:
                            word = word + "seven";
                            break;
                        case 8:
                            word = word + "eight";
                            break;
                        case 9:
                            word = word + "nine";
                            break;
                            case 10:
                                word = word + "ten";
                                break;
                        default:
                            break;
                    }
            }

        }
        else{
            word = "zero";}

        System.out.println(word);
    }
}