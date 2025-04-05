
import java.util.Scanner;

public class DistanceWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetNumber = scanner.nextInt();
        int numberOfWordToFollow = scanner.nextInt();
        int position = 0;
        double distance = 0;
        String result ="";
        double sum = 0;
        double avg = 0;
        int point = numberOfWordToFollow;

        while(numberOfWordToFollow >= 1) {
            String word = scanner.next();
            for (int i = 0; i < word.length(); i++) {
                switch(word.charAt(i)) {
                    case 'a':
                        position = position + 1;
                        break;
                    case 'b':
                        position = position + 2;
                        break;
                    case 'c':
                        position = position + 3;
                        break;
                    case 'd':
                        position = position + 4;
                        break;
                    case 'e':
                        position = position + 5;
                        break;
                    case 'f':
                        position = position + 6;
                        break;
                    case 'g':
                        position = position + 7;
                        break;
                    case 'h':
                        position = position + 8;
                        break;
                    case 'i':
                        position = position + 9;
                        break;
                    case 'j':
                         position = position + 10;
                         break;
                    case 'k':
                            position = position + 11;
                            break;
                    case 'l':
                        position = position + 12;
                        break;
                        case 'm':
                            position = position + 13;
                            break;
                    case 'n':
                        position = position + 14;
                        break;
                        case 'o':
                            position = position + 15;
                            break;
                        case 'p':
                            position = position + 16;
                            break;
                        case 'q':
                            position = position + 17;
                            break;
                        case 'r':
                            position = position + 18;
                            break;
                        case 's':
                            position = position + 19;
                            break;
                        case 't':
                            position = position + 20;
                            break;
                        case 'u':
                            position = position + 21;
                            break;
                         case 'v':
                             position = position + 22;
                             break;
                        case 'w':
                            position = position + 23;
                            break;
                        case 'x':
                            position = position + 24;
                            break;
                        case 'y':
                            position = position + 25;
                            break;
                        case 'z':
                            position = position + 26;
                            break;
                }
            }
            distance = targetNumber - position;
            if(distance < 0){
                distance = distance -  distance * 2;
            }
            sum += distance ;

            if(numberOfWordToFollow == 1 ){
            result = result + word +" "+ String.format("%.0f", distance);
            }else {
                result = result + word + " " + String.format("%.0f", distance) + "\n";
            }
            numberOfWordToFollow--;
            position = 0;
        }
        avg = sum / point;
        System.out.println(result);
        System.out.printf("%.2f",avg);

    }
}