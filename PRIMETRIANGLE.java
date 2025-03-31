import java.util.Scanner;

public class PRIMETRIANGLE
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int originalNumber = Integer.parseInt(scanner.nextLine());
        String rowNumber = "";

        originalNumber = Math.abs(originalNumber);
        for(int i = 0; i <= originalNumber; i++)
        {
                if (i == 2 || i == 3 )
                {
                    rowNumber = String.format(rowNumber + "%d",1);
                    System.out.println(rowNumber);
                }
                if (i == 5 ){
                    rowNumber = String.format(rowNumber +"0" + "%d",1);
                    System.out.println(rowNumber);
                }
                if (i == 7)
                {
                    rowNumber = String.format(rowNumber +"0"  + "%d",1);
                    System.out.println(rowNumber);
                }

                else if ((!(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0)))
                {
                    rowNumber ="";

                    for (int j = 1; j <= i; j++)
                    {
                        if (j == 1 || j == 2 || j == 3)
                        {
                            rowNumber = String.format(rowNumber + "%d",1);
                        }

                        else if (!(j % 2 == 0 || j % 3 == 0))
                            rowNumber = String.format(rowNumber + "%d", 1);
                            else
                            rowNumber = String.format(rowNumber + "%d", 0);
                    }

                    System.out.println(rowNumber);
                }
        }
    }
}
