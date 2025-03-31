import java.util.Scanner;

public class DogYears {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int humanYear = scanner.nextInt();
        int dogYear =0;

        if(humanYear>0 && humanYear<=2){

            dogYear = humanYear*10;
        }
        else if(humanYear>2 && humanYear<=15)
        {
            dogYear = ((humanYear-2)* 4)+20;
        }


        System.out.println(dogYear);

    }
}