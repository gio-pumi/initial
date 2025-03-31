import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthOfTheRectangle = Integer.parseInt(scanner.nextLine());
        int heightOfTheRectangle = Integer.parseInt(scanner.nextLine());

        System.out.println(widthOfTheRectangle * heightOfTheRectangle);
    }
}
