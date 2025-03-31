import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cards = scanner.next();
        int numberCards =0;

        switch (cards) {
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
                numberCards = Integer.parseInt(cards);
                break;
            default:
        }

        for (int i = 2; i <= numberCards; i++) {
            System.out.printf("%d of spades, %d of clubs, %d of hearts, %d of diamonds \n", i, i, i, i);
        }


        if (cards.equals("A") || cards.contains("K")|| cards.contains("Q") || cards.contains("J")) {
            switch (cards) {
                case "J":
                    for (int i = 2; i <= 10; i++) {
                        System.out.printf("%d of spades, %d of clubs, %d of hearts, %d of diamonds \n", i, i, i, i);
                    }
                    System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds \n", cards, cards, cards, cards);
                    break;
                case "Q":
                    for (int i = 2; i <= 10; i++) {
                        System.out.printf("%d of spades, %d of clubs, %d of hearts, %d of diamonds \n", i, i, i, i);
                    }
                    System.out.println("J of spades, J of clubs, J of hearts, J of diamonds ");
                    System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds \n", cards, cards, cards, cards);
                    break;
                case "K":
                    for (int i = 2; i <= 10; i++) {
                        System.out.printf("%d of spades, %d of clubs, %d of hearts, %d of diamonds \n", i, i, i, i);
                    }
                    System.out.println("J of spades, J of clubs, J of hearts, J of diamonds ");
                    System.out.println("Q of spades, Q of clubs, Q of hearts, Q of diamonds ");
                    System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds \n", cards, cards, cards, cards);
                    break;
                case "A":
                    for (int i = 2; i <= 10; i++) {
                        System.out.printf("%d of spades, %d of clubs, %d of hearts, %d of diamonds \n", i, i, i, i);
                    }
                    System.out.println("J of spades, J of clubs, J of hearts, J of diamonds ");
                    System.out.println("Q of spades, Q of clubs, Q of hearts, Q of diamonds ");
                    System.out.println("K of spades, K of clubs, K of hearts, K of diamonds ");
                    System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds \n", cards, cards, cards, cards);
                    break;
                default:
            }
        }
    }
}